<%-- 
    Document   : adduser
    Created on : Jul 8, 2018, 10:57:40 AM
    Author     : sanda
--%>

<%@page import="Database.DBconnect"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>  </title>
    </head>
    <body>
        
        <% 
            PreparedStatement pst;
          String Type = request.getParameter("Type");
          String Username = request.getParameter("Username");
          String Password = request.getParameter("password") ;
            
           
            
            try
{

Connection conn = DBconnect.ConnectDb() ;
String query="insert into login(Type,Username,Password) values(?,?,?)";

pst=conn.prepareStatement(query);

pst.setString(1,Type);
pst.setString(2,Username);
pst.setString(3,Password) ;

pst.executeUpdate();
response.sendRedirect("admin.jsp");

//RequestDispatcher rd=request.getRequestDispatcher("shape/admin.jsp");
//rd.forward(request,response);
}
            
catch(Exception e)
{
   out.print(e);
    }

%>
        
    </body>
</html>
