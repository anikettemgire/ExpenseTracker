<%@page import="org.hibernate.internal.build.AllowSysOut"%>
<%@page import="com.db.Hiber"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="componet/link.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index page</title>

</head>
<body>

<%@include file="componet/navbar.jsp" %>
<div id="carouselExampleControls" class="carousel slide" data-bs-ride="carousel">
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img src="iamge/ex1.jpg" class="d-block w-100" alt="..." width="500" height="650">
    </div>
    <div class="carousel-item">
      <img src="iamge/ex2.jpg" class="d-block w-100" alt="..." width="500" height="650">
    </div>
    <div class="carousel-item">
      <img src="iamge/ex3.jpg" class="d-block w-100" alt="..." width="500" height="650">
    </div>
     <div class="carousel-item">
      <img src="iamge/e4.jpg" class="d-block w-100" alt="..." width="500" height="650">
    </div>
     <div class="carousel-item">
      <img src="iamge/c.jpg" class="d-block w-100" alt="..." width="500" height="650">
    </div>
  </div>
  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Previous</span>
  </button>
  <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Next</span>
  </button>
</div>
<%@include file="componet/footer.jsp" %>
</body>
</html>