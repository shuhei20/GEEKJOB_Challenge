<%-- 
    Document   : DB11-1
    Created on : 2018/03/20, 2:00:21
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
        <form action="DB11no2" method="post">
            更新したい情報のID<br>
            <input type="numner" name="id" size="10"><br><br>
                
            ID以外の更新したい内容を入力<br>
            名前:<input type="text" name="name"><br>
            電話番号:<input type="text" name="tell" size="25"><br>
            年齢:<input type="text" name="age" size="10"><br>
            誕生日:<input type="text" name="birthday"><br>
            
            <input type ="submit" name ="btnSubmit" value ="検索">
        </form>
    </body>
</html>
