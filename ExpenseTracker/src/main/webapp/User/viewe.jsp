<%@page import="java.util.List"%>
<%@page import="com.entity.ExpenseDeatil"%>
<%@page import="com.dao.ExpenseDao"%>
<%@page import="com.entity.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     <%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="../componet/link.jsp" %>
<meta charset="ISO-8859-1">
<title>View Expense</title>
<style>
.paint-card{
box-shadow: 0 0 10px gray;
}
</style>
</head>
<c:if test="${empty userObj }">
<c:redirect url="../login.jsp"></c:redirect>
</c:if>
<body>
<%@include file="../componet/navbar.jsp" %>
<div class="container-fluid p-5">
	<div class="row">
		<div class="col-md-12">
		    <div class="card paint-card">
		    	<div class="card-header">
		    	   <p class="text-center fs-3">Expense Deatil</p>
		    	   <c:if test="${not empty msg }">
		    	   <p class="text-center text-success fs-1">${msg }</p>
		    	   <c:remove var="msg"/>
		    	   </c:if>
		    	      <c:if test="${not empty emsg }">
		    	   <p class="text-center text-succes fs-1">${emsg }</p>
		    	   <c:remove var="emsg"/>
		    	   </c:if>
		    	</div>
		    	<div class="card-body">
		    	<table class="table">
		    		<thead>
		    			<tr>
		    			   <th scope="col">Title</th>
		    			    <th scope="col">Description</th>
		    			     <th scope="col">Date</th>
		    			      <th scope="col">Time</th>
		    			       <th scope="col">Price</th>
		    			     
		    			        <th scope="col"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Action</th>
		    			</tr>
		    		</thead>
		    		<tbody>
		    		<%
		    		     HttpSession s=request.getSession();
		    		     User u=(User)s.getAttribute("userObj");
		    		                    List<ExpenseDeatil> el=ExpenseDao.getDeatil(u);
		    		                    for(ExpenseDeatil x:el){
		    		                    	
		    		                    
		    		%>
		    		       <tr>
		    		           <td><%=x.getTitle() %></td>
		    		           <td><%=x.getDate() %></td>
		    		           <td><%=x.getTime() %></td>
		    		           <td><%=x.getDescrip() %></td>
		    		           <td><%=x.getPrice() %></td>
		    		           <td>
		    		           <a href="edit.jsp?id=<%=x.getId() %>"  class="btn btn-primary">Edit</a>
		    		           <a href="../delete?id=<%=x.getId() %>"  class="btn btn-danger">Delete</a>
		    		           </td>
		    		       </tr>
		    		       <%} %>
		    		</tbody>
		    	</table>
		    	
		    	</div>
		    	
		    </div>
		</div>
	</div>
</div>

</body>
</html>