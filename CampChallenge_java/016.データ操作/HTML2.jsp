<%-- 
    Document   : HTML2
    Created on : 2018/03/05, 10:58:50
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
    
            out.print(request.getParameter("名前") + "<br>");
            out.print(request.getParameter("性別") + "<br>");
            out.print(request.getParameter("趣味"));
        %>
    </body>
</html>