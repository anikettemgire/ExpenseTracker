<%@page import="com.entity.ExpenseDeatil"%>
<%@page import="com.dao.ExpenseDao"%>
<%@page import="com.db.Hiber"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     <%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="../componet/link.jsp" %>
<meta charset="ISO-8859-1">
<title>Add Expense</title>
<style>
.paint-card{
box-shadow: 0 0  10px gray;
}
</style>
</head>
<c:if test="${ empty userObj }">
<c:redirect url="../login.jsp"></c:redirect>
</c:if>
<body class="bg-light">
<%@include file="../componet/navbar.jsp" %>
<div class="container p-5">
	<div class="row">
		<div class="col-md-6 offset-md-3">
			<div class="card paint-card">
				<div class="card-header">
				<p class="text-center fs-3">Edit Expense</p>
				<%
			          int id=Integer.parseInt(request.getParameter("id"));
				         ExpenseDeatil e=ExpenseDao.getExpenseDeatil(id);
				%>
				
				</div>
					<div class="card-body">
					<form action="../edit" method="post">
					     <div class="mb-3">
					     <label>Title</label>
					     <input type="text"  required name="title" value="<%=e.getTitle() %>" class="form-control">
					     </div>
					     <div class="mb-3">
					     <label>Date</label>
					     <input type="date" required name="date" value="<%=e.getDate() %>" class="form-control">
					     </div>
					     <div class="mb-3">
					     <label>Time</label>
					     <input type="time" required name="time" value="<%=e.getTime() %>" class="form-control">
					     
					     </div>
					     <div class="mb-3">
					     <label>Description</label>
					     <input type="text" required name="desc"  value="<%=e.getDescrip()%>"class="form-control">
					     </div>
					     <div class="md-3">
					     <label>Price</label>
					     <input type="text" required name="price" value="<%=e.getPrice() %>" class="form-control">
					     </div>
					    <br>
					     <input type="hidden" name="id" value="<%=e.getId()%>">
					     <button type="submit" class="btn btn-primary col-md-12">Update</button>
						</form>
					</div>
			
			</div>
		</div>
	</div>
</div>

</body>
</html>