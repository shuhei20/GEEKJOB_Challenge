<%-- 
    Document   : HTML3
    Created on : 2018/03/05, 14:45:06
    Author     : shuhei01
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
     <!--背景色の指定-->
    <body bgcolor="gray">
                    
        <!--画像の表示-->     
        <img src="gazou.jpg" alt="Sample"><br>
        
     
        <!--箇条書きの作成と段落の作成-->
        <p>
        好きな料理
            <ul>
                <li>和食</li>
                <li>洋食</li>
                <li>中華</li>
            </ul>
        </p>
        
        <!--ルビを追加する-->
        <ruby>
            青
            <rt>
            <!--フォントの色指定-->
            <font color="white">きいろ</font> 
            </rt>
        </ruby>
        
        <!--プルダウンボックスの作成-->
        <select>
            <option value="0">和食</option>
            <option value="1">洋食</option>
            <option value="2">中華</option>
        </select>

        <!--文字を斜めにする-->
        <h1><i>I'm Fine!</i></h1>
    </body>
</html>
