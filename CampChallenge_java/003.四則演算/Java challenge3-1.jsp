<%-- 
    Document   : Java challenge3-1
    Created on : 2018/01/26, 10:17:47
    Author     : shuhei01
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><%
            final int NUMBER = 6;
            int suji = 3;
            out.println(NUMBER + suji);
            out.println(NUMBER - suji);
            out.println(NUMBER * suji);
            out.println(NUMBER / suji);%></h1>
    </body>
</html>
