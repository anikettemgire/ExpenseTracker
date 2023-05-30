<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     <%@page isELIgnored="false"%>
         
<!DOCTYPE html>
<html>
<head>
<%@include file="componet/link.jsp" %>
<meta charset="ISO-8859-1">
<title>Register Page</title>
<style>
.paint-card{
box-shadow: 0 0 10px gray;
}
</style>
</head>
<body class="bg-light">
<%@include file="componet/navbar.jsp" %>
<div class="container p-5">
    <div class="row">
    	<div class="col-md-6 offset-md-3">
    	       <div class="card paint-card ">
    	             <div class="card-header">
    	             <p class="text-center fs-3">Registration</p>
    	             <c:if test="${not empty msg}">
    	             <p class="text-center text-success fs-1">${msg}</p>
    	             <c:remove var="msg"/>
    	             </c:if>
    	              <c:if test="${ not empty emsg}">
    	             <p class="text-center text-success fs-1">${emsg}</p>
    	              <c:remove var="emsg"/>
    	             </c:if>
    	             </div>
    	             	<div class="card-body ">
    	             	<form action="regiter" method="post">
    	             	  <div class="mb-3">
    	             	  <lable>Enter Full Name</lable>
    	             	  <input type="text" required name="name" placeholder="Enter Name"  class="form-control">
    	             	  </div>
    	             	  <div class="mb-3">
    	             	  <lable>Email</lable>
    	             	  <input type="email" required name="email" placeholder="Enter Email" class="form-control">
    	             	  </div>
    	             	   <div class="mb-3">
    	             	  <lable>Password</lable>
    	             	  <input type="password" required name="pass" placeholder="Enter password" class="form-control">
    	             	  </div>
    	             	    <div class="mb-3">
    	             	  <lable>Confirm Password</lable>
    	             	  <input type="password" required name="cpass" placeholder="Enter Confirm password" class="form-control">
    	             	  </div>
    	             	   <div class="mb-3">
    	             	   About
    	             	   <textarea rows="3" cols="" class="form-control" name="ab"></textarea>
    	             	  </div>
    	             	  
    	             	  <button type="submit" class="btn btn-success  col-md-12">Register</button>
    	             	</form>
    	             	</div>
    	             </div>
    	       </div>
    	</div>
    </div>
</div>
<div class="mt-0">
<%@include file="componet/footer.jsp" %>
</div>

</body>
</html>