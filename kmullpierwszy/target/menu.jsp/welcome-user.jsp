<%--
  Created by IntelliJ IDEA.
  User: sony
  Date: 29.12.17
  Time: 17:52
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%--<c:set var="bonus" scope="request" value="${1.2 * salaryAtribut}"/>--%>
    <c:set var="bonus" scope="request" value="${1.2 * salaryAtribut}"/>
    <p>atrybut/ request:</p>
    <p>imie: ${name}, wyplata: ${salaryAtribut}</p>
    <c:out value="${bonus}" default="100" />
    <br/>

    <c:set var="bonus" scope="request" value="${1.2 * salarySession}"/>
    <p>atrybut sesyjny:</p>
    <p>imie: ${sessionName}, wyplata: ${salarySession}</p>
    <c:out value="${bonus}" default="100" />

    <br/>
    <a href="welcome-user.jsp">welcome.jsp</a>
</body>
</html>
