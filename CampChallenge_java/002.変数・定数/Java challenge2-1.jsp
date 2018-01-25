<%-- 
    Document   : Java challenge2-1
    Created on : 2018/01/25, 13:21:27
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
            String prof = "染川脩平です。"
                    + "年齢は24歳です。"
                    + "出身地は大阪府です。";
            out.print(prof);
        %></h1>
    </body>
</html>
