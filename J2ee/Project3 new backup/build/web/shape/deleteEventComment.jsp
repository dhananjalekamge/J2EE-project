<%-- 
    Document   : deleteEventComment
    Created on : Jul 15, 2018, 12:26:05 AM
    Author     : sanda
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="Database.DBconnect"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   
    <body>
        
         <% 
            String user=(String) session.getAttribute("un");
            
           try{
                Connection conn = DBconnect.ConnectDb();
                PreparedStatement pst;
                String query= "delete from comments where user='"+user+"'";
                pst= conn.prepareStatement(query);
                //pst.setString(1,user);
                pst.executeUpdate();
                response.sendRedirect("ComEvent.jsp");
                
                
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
