package org.apache.jsp.shape;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.Connection;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html class=\"no-js\" lang=\"\"> <!--<![endif]-->\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <title>UNI-CO : Registration Form</title>\n");
      out.write("    <meta name=\"description\" content=\"Sufee Admin - HTML5 Admin Template\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("    <link rel=\"apple-touch-icon\" href=\"apple-icon.png\">\n");
      out.write("    <link rel=\"shortcut icon\" href=\"ic.ico\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/normalize.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/font-awesome.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/themify-icons.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/flag-icon.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/cs-skin-elastic.css\">\n");
      out.write("    <!-- <link rel=\"stylesheet\" href=\"assets/css/bootstrap-select.less\"> -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/scss/style.css\">\n");
      out.write("\n");
      out.write("    <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,600,700,800' rel='stylesheet' type='text/css'>\n");
      out.write("\n");
      out.write("    <!-- <script type=\"text/javascript\" src=\"https://cdn.jsdelivr.net/html5shiv/3.7.3/html5shiv.min.js\"></script> -->\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body class=\"bg-dark\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"sufee-login d-flex align-content-center flex-wrap\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"login-content\">\n");
      out.write("                <div class=\"login-logo\">\n");
      out.write("                    <h1>Registration Form</h1>\n");
      out.write("                    \n");
      out.write("                    <style>\n");
      out.write("                        \n");
      out.write("                        h1{\n");
      out.write("                            color:white;\n");
      out.write("                        }\n");
      out.write("                        \n");
      out.write("                    </style>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"login-form\">\n");
      out.write("                    <form method=\"post\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/RegisterUser\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Type of User</label> <br>\n");
      out.write("                            <input type=\"radio\" name=\"type\" value=\"rd1\"   /> <label>University</label> <br>\n");
      out.write("                            <input type=\"radio\" name=\"type\" value=\"rd2\" /> <label>Company</label>\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>University/ Company Name</label>\n");
      out.write("                            <input type=\"text\" name=\"name\" class=\"form-control\" placeholder=\"Enter Name\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Email address</label>\n");
      out.write("                            <input type=\"email\" name=\"em\" class=\"form-control\" placeholder=\"Enter Email\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Username</label>\n");
      out.write("                            <input type=\"text\" name=\"uname\" class=\"form-control\" placeholder=\"Enter Username\">\n");
      out.write("                        </div>\n");
      out.write("                      \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label>Password</label>\n");
      out.write("                            <input type=\"password\" name=\"pass\" class=\"form-control\" placeholder=\"Enter Password\">\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary btn-flat m-b-30 m-t-30\">Request to Register</button> <br> <br>\n");
      out.write("                        \n");
      out.write("                        <button type=\"reset\" class=\"btn btn-primary btn-flat m-b-30 m-t-30\">Cancel</button> <br> <br>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        <div class=\"register-link m-t-15 text-center\">\n");
      out.write("                            <p>Already have account ? <a href=\"login.jsp\"> Sign in</a></p> \n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <script src=\"assets/js/vendor/jquery-2.1.4.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/popper.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/plugins.js\"></script>\n");
      out.write("    <script src=\"assets/js/main.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
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
