package org.apache.jsp.shape;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    \n");
      out.write("    <head>\n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("\t<title>UNI-CO</title>\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\t<meta name=\"description\" content=\"Free HTML5 Website Template by FreeHTML5.co\" />\n");
      out.write("\t<meta name=\"keywords\" content=\"free website templates, free html5, free template, free bootstrap, free website template, html5, css3, mobile first, responsive\" />\n");
      out.write("\t<meta name=\"author\" content=\"FreeHTML5.co\" />\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\n");
      out.write("  \t\n");
      out.write("        \n");
      out.write("\n");
      out.write("\t<link href='https://fonts.googleapis.com/css?family=Work+Sans:400,300,600,400italic,700' rel='stylesheet' type='text/css'>\n");
      out.write("\t\n");
      out.write("\t<!-- Animate.css -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/animate.css\">\n");
      out.write("\t<!-- Icomoon Icon Fonts-->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/icomoon.css\">\n");
      out.write("\t<!-- Bootstrap  -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("\n");
      out.write("\t<!-- Magnific Popup -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/magnific-popup.css\">\n");
      out.write("\n");
      out.write("\t<!-- Theme style  -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("\n");
      out.write("\t<!-- Modernizr JS -->\n");
      out.write("\t<script src=\"js/modernizr-2.6.2.min.js\"></script>\n");
      out.write("\t<!-- FOR IE9 below -->\n");
      out.write("\t<!--[if lt IE 9]>\n");
      out.write("\t<script src=\"js/respond.min.js\"></script>\n");
      out.write("\t<![endif]-->\n");
      out.write("\n");
      out.write("\t</head>\n");
      out.write("\t<body>\n");
      out.write("\t\t\n");
      out.write("\t<div class=\"fh5co-loader\"></div>\n");
      out.write("\t\n");
      out.write("\t<div id=\"page\">\n");
      out.write("\t<nav class=\"fh5co-nav\" role=\"navigation\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-xs-12 text-center\">\n");
      out.write("\t\t\t\t\t<div id=\"fh5co-logo\"><a href=\"\">UNI-CO<span>.</span></a></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-xs-12 text-center menu-1\">\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li class=\"active\"><a href=\"home.jsp\">Home</a></li>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("                                                <li><a href=\"universities.jsp\">Universities</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"companies.jsp\">Companies</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"ideahub.jsp\">Idea Hub</a></li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("                                                <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/LogoutServlet\">Logout</a></li> \n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t</nav>\n");
      out.write("\n");
      out.write("\t<header id=\"fh5co-header\" class=\"fh5co-cover\" role=\"banner\" style=\"background-image:url(images/5.jpg);\">\n");
      out.write("\t\t<div class=\"overlay\"></div>\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-md-12 col-md-offset-0 text-center\">\n");
      out.write("\t\t\t\t\t<div class=\"display-t\">\n");
      out.write("\t\t\t\t\t\t<div class=\"display-tc animate-box\" data-animate-effect=\"fadeInUp\">\n");
      out.write("\t\t\t\t\t\t\t<h1 class=\"mb30\">connecting universities and companies to drive innovation</h1>\n");
      out.write("\t\t\t\t\t\t\t<p>\n");
      out.write("                                                            <a href=\"\" class=\"btn btn-primary\">Welcome</a> <br> \n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</header>\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\t<div id=\"fh5co-services\" class=\"fh5co-bg-section\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row row-pb-md\">\n");
      out.write("\t\t\t\t<div class=\"col-md-8 col-md-offset-2 text-center animate-box\" data-animate-effect=\"fadeInUp\">\n");
      out.write("\t\t\t\t\t<div class=\"fh5co-heading\">\n");
      out.write("\t\t\t\t\t\t<span>We're expert</span>\n");
      out.write("\t\t\t\t\t\t<h2>What We Do</h2>\n");
      out.write("\t\t\t\t\t\t<p>We are a platform that provides universities and companies with the facility to connect with each other to drive innovation. </p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-md-4 col-sm-4 \">\n");
      out.write("\t\t\t\t\t<div class=\"feature-center animate-box\" data-animate-effect=\"fadeInUp\">\n");
      out.write("\t\t\t\t\t\t<span class=\"icon\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"icon-eye\"></i>\n");
      out.write("\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t<h3>Are you from a University?</h3>\n");
      out.write("\t\t\t\t\t\t<p>We've got great companies collaborating with our platform that provides \n");
      out.write("                                                    various offers and internships for university students.<br>\n");
      out.write("                                                Take a look and find your dream job!</p>\n");
      out.write("\t\t\t\t\t\t<p><a href=\"companies.jsp\">Learn More</a></p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-4 col-sm-4 \">\n");
      out.write("\t\t\t\t\t<div class=\"feature-center animate-box\" data-animate-effect=\"fadeInUp\">\n");
      out.write("\t\t\t\t\t\t<span class=\"icon\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"icon-command\"></i>\n");
      out.write("\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t<h3>Are you from a Company?</h3>\n");
      out.write("                                                <p>Looking for the perfect employee for your next job vacancy?<br>\n");
      out.write("                                                Go through the universities using our platform for their details and find the best fit!</p>\n");
      out.write("\t\t\t\t\t\t<p><a href=\"universities.jsp\">Learn more</a></p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-4 col-sm-4 \">\n");
      out.write("\t\t\t\t\t<div class=\"feature-center animate-box\" data-animate-effect=\"fadeInUp\">\n");
      out.write("\t\t\t\t\t\t<span class=\"icon\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"icon-power\"></i>\n");
      out.write("\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t<h3>Got any Suggestions?</h3>\n");
      out.write("\t\t\t\t\t\t<p>Your ideas are important to us!<br>\n");
      out.write("                                                    Visit our Ideahub and make sure to post your questions, comments, ideas or suggestions. </p>\n");
      out.write("\t\t\t\t\t\t<p><a href=\"ideahub.jsp\">Learn more</a></p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\t<footer id=\"fh5co-footer\" role=\"contentinfo\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"row copyright\">\n");
      out.write("\t\t\t\t<div class=\"col-md-12 text-center\">\n");
      out.write("\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t<small class=\"block\">&copy; All Rights Reserved.</small> \n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t<ul class=\"fh5co-social-icons\">\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"icon-twitter\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"icon-facebook\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"icon-linkedin\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"icon-dribbble\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("                                    \n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t</footer>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<div class=\"gototop js-top\">\n");
      out.write("\t\t<a href=\"#\" class=\"js-gotop\"><i class=\"icon-arrow-up\"></i></a>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t<!-- jQuery -->\n");
      out.write("\t<script src=\"js/jquery.min.js\"></script>\n");
      out.write("\t<!-- jQuery Easing -->\n");
      out.write("\t<script src=\"js/jquery.easing.1.3.js\"></script>\n");
      out.write("\t<!-- Bootstrap -->\n");
      out.write("\t<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\t<!-- Waypoints -->\n");
      out.write("\t<script src=\"js/jquery.waypoints.min.js\"></script>\n");
      out.write("\t<!-- countTo -->\n");
      out.write("\t<script src=\"js/jquery.countTo.js\"></script>\n");
      out.write("\t<!-- Magnific Popup -->\n");
      out.write("\t<script src=\"js/jquery.magnific-popup.min.js\"></script>\n");
      out.write("\t<script src=\"js/magnific-popup-options.js\"></script>\n");
      out.write("\t<!-- Main -->\n");
      out.write("\t<script src=\"js/main.js\"></script>\n");
      out.write("\n");
      out.write("\t</body>\n");
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
