<%-- 
    Document   : Java challenge8-3
    Created on : 2018/01/31, 11:12:51
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
            int total = 0;
            for(int i=0; i<=100; i++){
                total += i;
            }
            out.print(total);
            %></h1>
    </body>
</html>
