<%-- 
    Document   : javachallenge5-1
    Created on : 2018/01/29, 10:26:28
    Document   : Java challenge5-1
    Created on : 2018/01/29, 13:11:44
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
            int num = 0;
            if(num == 1){
                out.println("1です!");
            }else if(num == 2){
                out.println("プログラミングキャンプ!");
            }else{
                out.println("その他です!");
            }
            
            int suji = 1;
            if(suji == 1){
                out.println("1です!");
            }else if(suji == 2){
                out.println("プログラミングキャンプ!");
            }else{
                out.println("その他です!");
            }
            
            int number = 2;
            if(number == 1){
                out.println("1です!");
            }else if(number == 2){
                out.println("プログラミングキャンプ!");
            }else{
                out.println("その他です!");
            }
        %></h1>
    </body>
</html>
