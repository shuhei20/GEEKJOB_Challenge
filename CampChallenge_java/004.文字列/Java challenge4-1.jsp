<%-- 
    Document   : Java challenge4-1
    Created on : 2018/01/26, 10:45:54
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
            final String NAME = "groove";
            String connect = "-";
            String name = "gear";
            out.print(NAME + connect + name);%></h1>
    </body>
</html>
