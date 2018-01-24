<%--
  Created by IntelliJ IDEA.
  User: sony
  Date: 27.12.17
  Time: 22:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.time.LocalDateTime" %>
<%@ page import="java.time.LocalDate" %>
<%@ page import="java.time.LocalTime" %>
<%@ page import="java.time.format.DateTimeFormatter" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ include file="index.jsp" %>--%>

<%! Date date = new Date();
    SimpleDateFormat tp = new SimpleDateFormat("dd.MM.yy HH:mm");%>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h1>Menu JSP</h1>
    <br/>
    <%@ include file="index.jsp" %>
    <br/>

    <%
        Date data = new Date();
        SimpleDateFormat sp = new SimpleDateFormat("dd.MM.yy HH:mm");
        out.println("czas: " + sp.format(data));
    %>
    <br/>
    <%
        LocalDateTime today = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM dd yy - HH:mm");
        out.println("Local czas: " + today.format(formatter));
    %>
    <br/>
    <%
        out.println("!czas: " + tp.format(date));
    %>

    <ul>
        <li><a href="/find-by-id">find by id (servlet)</a> </li>
        <li><a href="/find-by-login">find by login (servlet)</a> </li>
        <br/>
        <li><a href="/add-servlet">add user (servlet)</a> </li>
        <li><a href="add-user.jsp">add user (jsp)</a> </li>
        <br/>
        <li><a href="welcome-user.jsp">welcome (jsp)</a> </li>
        <li><a href="/welcome-user">welcome (servlet)</a> </li>
        <br/>
        <li><a href="users-list.jsp">users-list (jsp)</a> </li>
        <li><a href="/statistics">statistics (servlet)</a> </li>
        <br/>
        <li><a href="login.jsp">login (jsp)</a> </li>

    </ul>
    <br/><br/>
</body>
</html>
