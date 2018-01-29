<%-- 
    Document   : Java challenge6-1
    Created on : 2018/01/29, 14:46:58
    Author     : shuhei01
--%>

<%@page import="java.util.Arrays"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><%
            String[] data ={"10","100","soeda","hayashi","-20","118","END"};
             out.print(Arrays.toString(data));
            %>
        </h1>
    </body>
</html>
