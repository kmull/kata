<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: sony
  Date: 29.12.17
  Time: 21:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<c:forEach var="entry" items="${elements}">

    <c:choose>
        <c:when test="${entry.value.gender == 'MAN'}">
            <div style="color:blue">
            ID: <c:out value="${entry.key}"/><br/>
            imie: <c:out value="${entry.value.name}"/><br/>
            nazwisko: <c:out value="${entry.value.surname}"/><br/>
            login: <c:out value="${entry.value.login}"/><br/>
            wiek: <c:out value="${entry.value.age}"/><br/>
            plec: <c:out value="${entry.value.gender}"/><br/><br/>
            </div>
        </c:when>
        <c:otherwise>
            <div style="color:red">
                ID: <c:out value="${entry.key}"/><br/>
                imie: <c:out value="${entry.value.name}"/><br/>
                nazwisko: <c:out value="${entry.value.surname}"/><br/>
                login: <c:out value="${entry.value.login}"/><br/>
                wiek: <c:out value="${entry.value.age}"/><br/>
                plec: <c:out value="${entry.value.gender}"/><br/><br/>
            </div>
        </c:otherwise>
    </c:choose>
</c:forEach>
<br/>
<a href="menu.jsp">menu</a>

</body>
</html>

<%--<c:forEach var="entry" items="${elements}">--%>
<%--<div>--%>
<%--ID: <c:out value="${entry.key}"/><br/>--%>
<%--imie: <c:out value="${entry.value.name}"/><br/>--%>
<%--nazwisko: <c:out value="${entry.value.surname}"/><br/>--%>
<%--login: <c:out value="${entry.value.login}"/><br/>--%>
<%--wiek: <c:out value="${entry.value.age}"/><br/>--%>
<%--plec: <c:out value="${entry.value.gender}"/><br/><br/>--%>
<%--</div>--%>
<%--</c:forEach>--%>