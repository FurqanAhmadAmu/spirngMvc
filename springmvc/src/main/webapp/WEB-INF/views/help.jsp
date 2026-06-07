<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<%@ page import="java.util.List" %>
<%@ page import="java.time.LocalDateTime" %>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<head>
    <title>Help Page</title>
</head>
<body>
   <h1>This is Help Page</h1>

    <%--
    String name=(String)request.getAttribute("name");
    Integer Rollnumber=(Integer)request.getAttribute("Rollnumber");
    LocalDateTime time=(LocalDateTime)request.getAttribute("time");
    --%>

    <h1> Name is ${name} </h1>
    <h1>Rollnumber  is ${Rollnumber} </h1>
    <h1> LocalDateTime is ${time} </h1>
    <hr>

  <c:forEach var ="item" items="${marks}">
  <h1> ${item}</h1>
  </c:forEach>


  <h1> List is ${marks} </h1>







</body>
</html>
