<%-- 
    Document   : Quelistring1-2
    Created on : 2018/03/05, 17:13:15
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
        <%
            request.setCharacterEncoding("UTF-8");
            
            String total = request.getParameter("total");
            String count = request.getParameter("count");
            String type  = request.getParameter("type");
            
            
            int type1 = Integer.parseInt(type);
            if(type1 == 1){
                out.print("雑貨");
            }else if(type1 ==2){
                out.print("生鮮食品");
            }else{
                out.print("その他");
            }
            
            int total1 = Integer.parseInt(total);
            int count1 = Integer.parseInt(count);
            
            
            int number = total1 / count1;
            out.print("1個あたりの値段は" + number + "円です");
            
            if(total1 >= 5000){
                double numbers = total1 * 0.05;
                int numbersA =(int)numbers;
                out.print(numbersA + "ポイントつきました");
            }else if(total1 >= 3000){
                double numbers1 = total1 * 0.04;
                int numbersB = (int)numbers1;
                out.print(numbersB + "ポイントつきました");
            }else{
                out.print("ポイントはつきませんでした");
            }
            
        %>
            
    </body>
</html>
