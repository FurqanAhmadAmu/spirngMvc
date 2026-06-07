<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<%@ page import="java.util.List" %>

<head>
    <title>Spring MVC with Spring Boot</title>
</head>
<body>
    <h1>Hello, Spring Boot MVC!</h1>
    <%
    String name=(String)request.getAttribute("name");
   Integer id =(Integer)request.getAttribute("id");
   List<String> friends=(List<String>)request.getAttribute("friends");
    %>

    <h1> Name is <%=name%></h1>
    <h1> Id is <%=id%></h1>

    <%
     for(String s:friends){
     %>
     <h1> <%=s%> </h1>
     <%
     }
     %>


</body>\
</html>
