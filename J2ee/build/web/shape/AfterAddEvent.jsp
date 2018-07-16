

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
              
              
                  String sql1="INSERT INTO date (dates,events) VALUES ('"+date+"','"+events+"')";
        
               pst=con.prepareStatement(sql1);
                pst.execute();
               
                
                
                    try{
          String sql="SELECT * FROM date where user='"+user+"'";
         
               pst=con.prepareStatement(sql);
                rs = pst.executeQuery();
                
                response.sendRedirect("http://localhost:8080/Project3%20old/shape/Addevent.jsp");
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