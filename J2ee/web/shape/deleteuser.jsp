<%-- 
    Document   : deleteuser
    Created on : Jul 8, 2018, 10:58:00 AM
    Author     : sanda
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="Database.DBconnect"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> </title>
    </head>
    <body>
       
        <% 
            String Username = request.getParameter("Username");
            out.print(Username);
            out.print("hhhdhhddn");
           try{
                Connection conn = DBconnect.ConnectDb();
                PreparedStatement pst;
                String query= "delete from unitemporary where Username=?";
                pst= conn.prepareStatement(query);
                pst.setString(1,Username);
                pst.executeUpdate();
                response.sendRedirect("admin.jsp");
                
                
               // RequestDispatcher rd= request.getRequestDispatcher("admin.jsp");
               // rd.forward(request,response);
               out.print("success");
           }    
            
            

    
catch(Exception e)
{
    out.print(e);
    }
            
            
            %> 
            
            
            
           
            
            
    </body>
</html>
