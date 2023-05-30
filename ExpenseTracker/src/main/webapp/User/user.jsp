<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     <%@page isELIgnored="false"%>
     <%@include file="../componet/link.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Home Page</title>
</head>
<c:if test="${empty userObj}">
<c:redirect url="../login.jsp"></c:redirect>
</c:if>
<body>
<%@include file="../componet/navbar.jsp" %>
</body>
</html>