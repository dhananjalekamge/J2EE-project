<%-- 
    Document   : deletecomment
    Created on : Jul 11, 2018, 7:05:38 PM
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
            String user=(String) session.getAttribute("un");
            
           try{
                Connection conn = DBconnect.ConnectDb();
                PreparedStatement pst;
                String query= "delete from ideahub where user='"+user+"'";
                pst= conn.prepareStatement(query);
                //pst.setString(1,user);
                pst.executeUpdate();
                response.sendRedirect("ideahub.jsp");
                
                
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
