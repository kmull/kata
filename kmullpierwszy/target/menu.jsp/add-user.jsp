<%--
  Created by IntelliJ IDEA.
  User: sony
  Date: 29.12.17
  Time: 12:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/add-servlet"  method="POST">
        <table>
            <tr>
                <td>imie: </td>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <td>nazwisko: </td>
                <td><input type="text" name="surname"></td>
            </tr>
            <tr>
                <td>login:</td>
                <td><input type="text" name="login"></td>
            </tr>
            <tr>
                <td>wiek:</td>
                <td><input type="text" name="age"></td>
            </tr>
            <tr>
                <td>id:</td>
                <td><input type="text" name="id"></td>
            </tr>
            <tr>
                <td>płeć:</td>
                <td><input type="text" name="gender"></td>
            </tr>
            <br/>
        </table>
        <br/>
        <input type="submit" value="dodaj">
    </form>
    <br/><br/>
    <p><a href="/statistics">statystyki</a></p>
    <p><a href="menu.jsp">menu</a></p>
</body>
</html>
