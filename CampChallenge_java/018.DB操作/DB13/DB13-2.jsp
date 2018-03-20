<%-- 
    Document   : DB13-2
    Created on : 2018/03/20, 2:33:01
    Author     : shuhei01
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>商品情報登録ページ</title>
    </head>
    <body>
        <%
            String contents = (String) session.getAttribute("check");
            if (contents == "white") {
                out.print("商品登録失敗<br>");
            } else if (contents == "word") {
                out.println("商品登録失敗<br>");
            } else {
                out.print("こんにちは。" + contents +"さん。<br><br>");
                out.print("新しい商品の登録ができます。<br>");
            }
        %>
        
        <form action="DB13no3" method="post">
            番号　　 <input type="text" name="bango"><br>
            商品名　<input type="text" name="syohin"><br>
            個数　　 <input type="text" name="kosu"><br>
            価格　　 <input type="text" name="kakaku"><br>
            
            <input type="submit" name="btnSubmit" value="登録">
            <input type="reset" name="rstSubmit" value="リセット">
        </form>
        
        <form action="DB13no4" method="post">
            <br><br>現在、登録されている商品一覧を確認<br><br>
            <input type="submit" name="btnSubmit" value="商品一覧">
        </form>
        
        <form action="DB13no6" method="post">
            <br><br>商品情報を削除する場合は、品番を指定してください<br><br>
            品番　<input type="text" name="delete"><br><br>
            <input type="submit" name="btnSubmit" value="削除">
        </form>
        
        <form action="DB13-1.jsp" method="post">
            <input type="submit" name="submit" value="ログアウト<%session.setAttribute("check", "logout");%>">
        </form>
    </body>
</html>
