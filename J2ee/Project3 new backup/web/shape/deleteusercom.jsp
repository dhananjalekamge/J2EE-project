<%-- 
    Document   : deleteusercom
    Created on : Jul 10, 2018, 9:31:22 PM
    Author     : sanda
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="Database.DBconnect"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
       
         <% 
            String Username = request.getParameter("Username");
            out.print(Username);
            out.print("hhhdhhddn");
           try{
                Connection conn = DBconnect.ConnectDb();
                PreparedStatement pst;
                String query= "delete from comtemporary where Username=?";
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
