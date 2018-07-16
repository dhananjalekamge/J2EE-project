<%-- 
    Document   : AfterAddEventUNI
    Created on : Jul 12, 2018, 8:13:34 PM
    Author     : sanda
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   
    <body>
                    
            
            <%
                
                  Connection con=null;
              PreparedStatement pst=null;
              ResultSet rs=null;
              
              try{
           
             Class.forName("com.mysql.jdbc.Driver");
            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/shapedb","root",""); 
            
              }
            
             catch(Exception e){
                out.print("Submition Failed");
            }
              
              
              
              String date=request.getParameter("date");
              String events=request.getParameter("events");
             
               String user=(String) session.getAttribute("un");
              
              if(date!="" && events!=""){
              
              
                  String sql1="INSERT INTO dateuni (dates,events,user) VALUES ('"+date+"','"+events+"',"+user+"')";
        
               pst=con.prepareStatement(sql1);
                pst.execute();
               
                
                
                    try{
          String sql="SELECT * FROM dateuni where user='"+user+"'";
         
               pst=con.prepareStatement(sql);
                rs = pst.executeQuery();
                
                response.sendRedirect("http://localhost:8080/Project3%20old/shape/AddeventUNI.jsp");
                %>
                
                <%
                
          while(rs.next()){
                 
              %>
              
             
           <%
             
            }
            %>
                
            <%
            
                con.close();
                
            
            }
            catch(Exception e){
                System.out.println("hello");
            }     

               

            }
            

                %>
                    
                                  
                                     
</body> 
    
</html>
