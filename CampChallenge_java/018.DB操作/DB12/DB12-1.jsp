<%-- 
    Document   : DB12-1
    Created on : 2018/03/20, 2:09:58
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
        <form action="DB12no2" method="post">
            情報の「名前・年齢・誕生日」を入力<br><br>    
                
            名前:<input type="text" name="name"><br>
            年齢:<input type="text" name="age" size="10"><br>
            誕生日:<input type="text" name="birthday"><br>
                
                <input type ="submit" name ="btnSubmit" value ="検索">
        </form>
    </body>
</html>
