<%-- 
    Document   : agecalculator
    Created on : Jan 24, 2023, 8:51:47 AM
    Author     : burha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="hello">
            Enter your age: <input type="text" name="age" value="${age}"><br>
            <input type="submit" value="Age next Birthday">
                       
        </form>
    </body>
</html>
