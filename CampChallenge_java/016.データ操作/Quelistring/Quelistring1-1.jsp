<%-- 
    Document   : Quelistring1
    Created on : 2018/03/05, 15:56:19
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
        <form action ="./test.jsp" method ="get">
            
            総額
            <select name ="total">          
                             
                    <option value ="1500"> 1500円                 
                    <option value ="3000"> 3000円 
                    <option value ="4500"> 4500円
            </select><br>
            
            個数 
            <select name ="count">
                    <option value ="5">   5個
                    <option value ="10"> 10個
                    <option value ="15"> 15個
            </select><br><br>
            
            商品種別<br>
            雑貨　　 <input type ="radio" name ="type" value ="1"><br>
            生鮮食品 <input type ="radio" name ="type" value ="2"><br>
            その他 　<input type ="radio" name ="type" value ="3"><br><br>
            
            <input type ="submit" name ="btnSubmit">
            
        </form>
    </body>
</html>
