<%-- 
    Document   : Java challenge8-4
    Created on : 2018/01/31, 11:31:02
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
            int count = 1000;
            while(count>100){
                count = count/2;
                out.println(count);
            }
            %></h1>
    </body>
</html>
