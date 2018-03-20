<%-- 
    Document   : DB13-1
    Created on : 2018/03/20, 2:26:25
    Author     : shuhei01
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ログイン画面</title>
    </head>
    <body>
        <%
            String contents = (String) session.getAttribute("check");
            if (contents == "white") {
                out.print("ログイン失敗<br>");
            } else if (contents == "word") {
                out.println("ログイン失敗<br>");
            } else if (contents == null) {
                out.print("ようこそ、ゲストさん！<br>");
            } else if (contents == "logout") {
                out.print("ログアウト<br>");
            }
        %>
        <form action="DB13no4" method="post">

            名前<br><input type="text" name="name"><br>
            ログインID（半角数字）<br><input type="text" name="userID"><br>
            パスワード（半角英数字）<br><input type="text" name="password"><br><br>
            <input type="submit" name="btnSubmit" value="ログイン">
            <input type="reset" name="rstSubmit" value="リセット">
    </body>
</html>
