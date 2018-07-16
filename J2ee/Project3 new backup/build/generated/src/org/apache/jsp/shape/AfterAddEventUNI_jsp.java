package org.apache.jsp.shape;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class AfterAddEventUNI_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("   \n");
      out.write("    <body>\n");
      out.write("                    \n");
      out.write("            \n");
      out.write("            ");

                
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
              String cam_name=request.getParameter("cam_name");
              
               String user=(String) session.getAttribute("un");
              
              if(date!="" && events!=""){
              
              
                  String sql1="INSERT INTO dateuni (dates,events,cam_name,user) VALUES ('"+date+"','"+events+"','"+cam_name+"','"+user+"')";
        
               pst=con.prepareStatement(sql1);
                pst.execute();
               
                
                
                    try{
          String sql="SELECT * FROM dateuni where user='"+user+"'";
         
               pst=con.prepareStatement(sql);
                rs = pst.executeQuery();
                
                response.sendRedirect("http://localhost:8080/Project3%20old/shape/AddeventUNI.jsp");
                
      out.write("\n");
      out.write("                \n");
      out.write("                ");

                
          while(rs.next()){
                 
              
      out.write("\n");
      out.write("              \n");
      out.write("             \n");
      out.write("           ");

             
            }
            
      out.write("\n");
      out.write("                \n");
      out.write("            ");

            
                con.close();
                
            
            }
            catch(Exception e){
                System.out.println("hello");
            }     

               

            }
            

                
      out.write("\n");
      out.write("                    \n");
      out.write("                                  \n");
      out.write("                                     \n");
      out.write("</body> \n");
      out.write("    \n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
