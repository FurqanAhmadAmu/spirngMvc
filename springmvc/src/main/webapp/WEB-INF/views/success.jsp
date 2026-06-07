<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<%@ page import="java.util.List" %>
<%@ page import="java.time.LocalDateTime" %>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<head>
<!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Help Page</title>
</head>
<body>
<div class="container mt-5">
  <h3 class="text-center">${Header}</h3>
  <h1 style="color:green"> ${msg}</h1>
  <p class="text-center"> ${Desc}</p>
  <hr>
<h1> welcome ${user.username}</h1>
<h1> your emailId is ${user.email} </h1>
<h1> your password is ${user.password} try to secure it </h1>

 </body>
   <h1>This is Help Page</h1>
