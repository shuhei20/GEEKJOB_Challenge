<%-- 
    Document   : Java challenge7-1
    Created on : 2018/01/29, 16:49:58
    Author     : shuhei01
--%>

<%@page import="java.util.HashMap"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><%
            HashMap<String,String> data = new HashMap<String,String>();
            data.put("1","AAA");
            data.put("hello","world");
            data.put("soeda","33");
            data.put("20","20");
            out.print(data);
            %></h1>
    </body>
</html>
