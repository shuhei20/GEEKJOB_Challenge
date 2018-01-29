<%-- 
    Document   : Java challenge5-3
    Created on : 2018/01/29, 13:10:55
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
            char word = 'A';
            switch(word){
                case 'A':
                    out.print("英語");
                    break;
                case 'あ':
                    out.print("日本語");
                    break;
                default:
                    break;
    }%></h1>
    </body>
</html>
