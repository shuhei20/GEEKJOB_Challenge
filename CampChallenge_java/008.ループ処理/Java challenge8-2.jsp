<%-- 
    Document   : Java challenge8-2
    Created on : 2018/01/31, 10:32:00
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
            String word ="A";
            String moji ="A";
            for(int i=0; i<30; i++){
                out.print(word + moji + i);
            }
            %></h1>
    </body>
</html>
