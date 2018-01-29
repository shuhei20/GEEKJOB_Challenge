<%-- 
    Document   : Java challenge6-2
    Created on : 2018/01/29, 15:20:57
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
            data[2] = "[33]"; 
            out.print(Arrays.toString(data));
            %>
        </h1>
    </body>
</html>
