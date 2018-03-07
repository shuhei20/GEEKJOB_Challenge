<%-- 
    Document   : Cookie
    Created on : 2018/03/07, 10:27:08
    Author     : shuhei01
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            //現在時刻を記録
            Date d = new Date();
            //現在時刻を取得
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            //Date型を文字列に変換
            String date = sdf.format(d);
            
            //"現在時刻"という名前で現在時刻を登録
            Cookie c = new Cookie("LastLogin", date);
            //cookieに反映
            response.addCookie(c);
    
            //前回記録した日時を表示する
            Cookie[] cs = request.getCookies();
            
            for(int i=0; i<cs.length; i++) {
                if(cs[i].getName().equals("LastLogin")) {
                out.print("前回のアクセス日時は" + cs[i].getValue());
                break;
                }
            }
        %>
    </body>
</html>
