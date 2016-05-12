<%-- 
    Document   : newjsp
    Created on : 4/mai/2016, 17:54:15
    Author     : Utilizador
--%>

<%@page import="java.util.List"%>
<%@page import="les.dr.dao.Utilizador"%>
<%@page import="les.dr.dao.Utilizadores"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <h1>Hello World!</h1>
        <%
            Utilizadores uts = new Utilizadores();
            List<Utilizador> lu = uts.list();
            for(Utilizador u:lu){
                out.println("<tr>");
                out.println("<td>"+u.getEmail()+"</td>");
                out.println("<td>"+u.getName()+"</td>");
                out.println("<td>"+u.getPassword()+"</td>");
                out.println("tr");
            }
            
            
            %>
    </body>
</html>
