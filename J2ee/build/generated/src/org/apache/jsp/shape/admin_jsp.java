package org.apache.jsp.shape;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html class=\"no-js\" lang=\"\"> <!--<![endif]-->\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <title>Admin </title>\n");
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
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/lib/datatable/dataTables.bootstrap.min.css\">\n");
      out.write("    <!-- <link rel=\"stylesheet\" href=\"assets/css/bootstrap-select.less\"> -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/scss/style.css\">\n");
      out.write("\n");
      out.write("    <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,600,700,800' rel='stylesheet' type='text/css'>\n");
      out.write("\n");
      out.write("    <!-- <script type=\"text/javascript\" src=\"https://cdn.jsdelivr.net/html5shiv/3.7.3/html5shiv.min.js\"></script> -->\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("        <!-- Left Panel -->\n");
      out.write("\n");
      out.write("    <aside id=\"left-panel\" class=\"left-panel\">\n");
      out.write("        <nav class=\"navbar navbar-expand-sm navbar-default\">\n");
      out.write("\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#main-menu\" aria-controls=\"main-menu\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                    <i class=\"fa fa-bars\"></i>\n");
      out.write("                </button>\n");
      out.write("                <a class=\"navbar-brand\" href=\"./\"><img src=\"images/logo.png\" alt=\"Logo\"></a>\n");
      out.write("                <a class=\"navbar-brand hidden\" href=\"./\"><img src=\"images/logo2.png\" alt=\"Logo\"></a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div id=\"main-menu\" class=\"main-menu collapse navbar-collapse\">\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"admin.jsp\"> <i class=\"menu-icon fa fa-dashboard\"></i>Dashboard </a>\n");
      out.write("                    </li>\n");
      out.write("                    <h3 class=\"menu-title\">UI elements</h3><!-- /.menu-title -->\n");
      out.write("                    <li class=\"menu-item-has-children dropdown\">\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\"> <i class=\"menu-icon fa fa-laptop\"></i>Components</a>\n");
      out.write("                        <ul class=\"sub-menu children dropdown-menu\">\n");
      out.write("                            <li><i class=\"fa fa-puzzle-piece\"></i><a href=\"ui-buttons.html\">Buttons</a></li>\n");
      out.write("                            <li><i class=\"fa fa-id-badge\"></i><a href=\"ui-badges.html\">Badges</a></li>\n");
      out.write("                            <li><i class=\"fa fa-bars\"></i><a href=\"ui-tabs.html\">Tabs</a></li>\n");
      out.write("                            <li><i class=\"fa fa-share-square-o\"></i><a href=\"ui-social-buttons.html\">Social Buttons</a></li>\n");
      out.write("                            <li><i class=\"fa fa-id-card-o\"></i><a href=\"ui-cards.html\">Cards</a></li>\n");
      out.write("                            <li><i class=\"fa fa-exclamation-triangle\"></i><a href=\"ui-alerts.html\">Alerts</a></li>\n");
      out.write("                            <li><i class=\"fa fa-spinner\"></i><a href=\"ui-progressbar.html\">Progress Bars</a></li>\n");
      out.write("                            <li><i class=\"fa fa-fire\"></i><a href=\"ui-modals.html\">Modals</a></li>\n");
      out.write("                            <li><i class=\"fa fa-book\"></i><a href=\"ui-switches.html\">Switches</a></li>\n");
      out.write("                            <li><i class=\"fa fa-th\"></i><a href=\"ui-grids.html\">Grids</a></li>\n");
      out.write("                            <li><i class=\"fa fa-file-word-o\"></i><a href=\"ui-typgraphy.html\">Typography</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"menu-item-has-children active dropdown\">\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\"> <i class=\"menu-icon fa fa-table\"></i>Tables</a>\n");
      out.write("                        <ul class=\"sub-menu children dropdown-menu\">\n");
      out.write("                            <li><i class=\"fa fa-table\"></i><a href=\"tables-basic.html\">Basic Table</a></li>\n");
      out.write("                            <li><i class=\"fa fa-table\"></i><a href=\"tables-data.html\">Data Table</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"menu-item-has-children dropdown\">\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\"> <i class=\"menu-icon fa fa-th\"></i>Forms</a>\n");
      out.write("                        <ul class=\"sub-menu children dropdown-menu\">\n");
      out.write("                            <li><i class=\"menu-icon fa fa-th\"></i><a href=\"forms-basic.html\">Basic Form</a></li>\n");
      out.write("                            <li><i class=\"menu-icon fa fa-th\"></i><a href=\"forms-advanced.html\">Advanced Form</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <h3 class=\"menu-title\">Icons</h3><!-- /.menu-title -->\n");
      out.write("\n");
      out.write("                    <li class=\"menu-item-has-children dropdown\">\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\"> <i class=\"menu-icon fa fa-tasks\"></i>Icons</a>\n");
      out.write("                        <ul class=\"sub-menu children dropdown-menu\">\n");
      out.write("                            <li><i class=\"menu-icon fa fa-fort-awesome\"></i><a href=\"font-fontawesome.html\">Font Awesome</a></li>\n");
      out.write("                            <li><i class=\"menu-icon ti-themify-logo\"></i><a href=\"font-themify.html\">Themefy Icons</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"widgets.html\"> <i class=\"menu-icon ti-email\"></i>Widgets </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"menu-item-has-children dropdown\">\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\"> <i class=\"menu-icon fa fa-bar-chart\"></i>Charts</a>\n");
      out.write("                        <ul class=\"sub-menu children dropdown-menu\">\n");
      out.write("                            <li><i class=\"menu-icon fa fa-line-chart\"></i><a href=\"charts-chartjs.html\">Chart JS</a></li>\n");
      out.write("                            <li><i class=\"menu-icon fa fa-area-chart\"></i><a href=\"charts-flot.html\">Flot Chart</a></li>\n");
      out.write("                            <li><i class=\"menu-icon fa fa-pie-chart\"></i><a href=\"charts-peity.html\">Peity Chart</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li class=\"menu-item-has-children dropdown\">\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\"> <i class=\"menu-icon fa fa-area-chart\"></i>Maps</a>\n");
      out.write("                        <ul class=\"sub-menu children dropdown-menu\">\n");
      out.write("                            <li><i class=\"menu-icon fa fa-map-o\"></i><a href=\"maps-gmap.html\">Google Maps</a></li>\n");
      out.write("                            <li><i class=\"menu-icon fa fa-street-view\"></i><a href=\"maps-vector.html\">Vector Maps</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <h3 class=\"menu-title\">Extras</h3><!-- /.menu-title -->\n");
      out.write("                    <li class=\"menu-item-has-children dropdown\">\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\"> <i class=\"menu-icon fa fa-glass\"></i>Pages</a>\n");
      out.write("                        <ul class=\"sub-menu children dropdown-menu\">\n");
      out.write("                            <li><i class=\"menu-icon fa fa-sign-in\"></i><a href=\"page-login.html\">Login</a></li>\n");
      out.write("                            <li><i class=\"menu-icon fa fa-sign-in\"></i><a href=\"page-register.html\">Register</a></li>\n");
      out.write("                            <li><i class=\"menu-icon fa fa-paper-plane\"></i><a href=\"pages-forget.html\">Forget Pass</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div><!-- /.navbar-collapse -->\n");
      out.write("        </nav>\n");
      out.write("    </aside><!-- /#left-panel -->\n");
      out.write("\n");
      out.write("    <!-- Left Panel -->\n");
      out.write("\n");
      out.write("    <!-- Right Panel -->\n");
      out.write("\n");
      out.write("    <div id=\"right-panel\" class=\"right-panel\">\n");
      out.write("\n");
      out.write("        <!-- Header-->\n");
      out.write("        <header id=\"header\" class=\"header\">\n");
      out.write("\n");
      out.write("            <div class=\"header-menu\">\n");
      out.write("\n");
      out.write("                <div class=\"col-sm-7\">\n");
      out.write("                    <a id=\"menuToggle\" class=\"menutoggle pull-left\"><i class=\"fa fa fa-tasks\"></i></a>\n");
      out.write("                    <div class=\"header-left\">\n");
      out.write("                        <button class=\"search-trigger\"><i class=\"fa fa-search\"></i></button>\n");
      out.write("                        <div class=\"form-inline\">\n");
      out.write("                            <form class=\"search-form\">\n");
      out.write("                                <input class=\"form-control mr-sm-2\" type=\"text\" placeholder=\"Search ...\" aria-label=\"Search\">\n");
      out.write("                                <button class=\"search-close\" type=\"submit\"><i class=\"fa fa-close\"></i></button>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"dropdown for-notification\">\n");
      out.write("                          <button class=\"btn btn-secondary dropdown-toggle\" type=\"button\" id=\"notification\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                            <i class=\"fa fa-bell\"></i>\n");
      out.write("                            <span class=\"count bg-danger\"></span>\n");
      out.write("                          </button>\n");
      out.write("                          <div class=\"dropdown-menu\" aria-labelledby=\"notification\">\n");
      out.write("                            <p class=\"red\"></p>\n");
      out.write("                            <a class=\"dropdown-item media bg-flat-color-1\" href=\"#\">\n");
      out.write("                                <i class=\"fa fa-check\"></i>\n");
      out.write("                               \n");
      out.write("                            </a>\n");
      out.write("                            <a class=\"dropdown-item media bg-flat-color-4\" href=\"#\">\n");
      out.write("                                <i class=\"fa fa-info\"></i>\n");
      out.write("                               \n");
      out.write("                            </a>\n");
      out.write("                            <a class=\"dropdown-item media bg-flat-color-5\" href=\"#\">\n");
      out.write("                                <i class=\"fa fa-warning\"></i>\n");
      out.write("                               \n");
      out.write("                            </a>\n");
      out.write("                          </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"dropdown for-message\">\n");
      out.write("                          <button class=\"btn btn-secondary dropdown-toggle\" type=\"button\"\n");
      out.write("                                id=\"message\"\n");
      out.write("                                data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                            <i class=\"ti-email\"></i>\n");
      out.write("                            <span class=\"count bg-primary\">9</span>\n");
      out.write("                          </button>\n");
      out.write("                          <div class=\"dropdown-menu\" aria-labelledby=\"message\">\n");
      out.write("                            <p class=\"red\"></p>\n");
      out.write("                            <a class=\"dropdown-item media bg-flat-color-1\" href=\"#\">\n");
      out.write("                                <span class=\"photo media-left\"><img alt=\"avatar\" src=\"images/avatar/1.jpg\"></span>\n");
      out.write("                                <span class=\"message media-body\">\n");
      out.write("                                    <span class=\"name float-left\"></span>\n");
      out.write("                                    <span class=\"time float-right\"></span>\n");
      out.write("                                       \n");
      out.write("                                </span>\n");
      out.write("                            </a>\n");
      out.write("                            <a class=\"dropdown-item media bg-flat-color-4\" href=\"#\">\n");
      out.write("                                <span class=\"photo media-left\"><img alt=\"avatar\" src=\"images/avatar/2.jpg\"></span>\n");
      out.write("                                <span class=\"message media-body\">\n");
      out.write("                                    <span class=\"name float-left\"></span>\n");
      out.write("                                    <span class=\"time float-right\"></span>\n");
      out.write("                                        <p>Lorem ipsum dolor sit amet, consectetur</p>\n");
      out.write("                                </span>\n");
      out.write("                            </a>\n");
      out.write("                            <a class=\"dropdown-item media bg-flat-color-5\" href=\"#\">\n");
      out.write("                                <span class=\"photo media-left\"><img alt=\"avatar\" src=\"images/avatar/3.jpg\"></span>\n");
      out.write("                                <span class=\"message media-body\">\n");
      out.write("                                    <span class=\"name float-left\">Cheryl Wheeler</span>\n");
      out.write("                                    <span class=\"time float-right\">10 minutes ago</span>\n");
      out.write("                                        <p>Hello, this is an example msg</p>\n");
      out.write("                                </span>\n");
      out.write("                            </a>\n");
      out.write("                            <a class=\"dropdown-item media bg-flat-color-3\" href=\"#\">\n");
      out.write("                                <span class=\"photo media-left\"><img alt=\"avatar\" src=\"images/avatar/4.jpg\"></span>\n");
      out.write("                                <span class=\"message media-body\">\n");
      out.write("                                    <span class=\"name float-left\">Rachel Santos</span>\n");
      out.write("                                    <span class=\"time float-right\">15 minutes ago</span>\n");
      out.write("                                        <p>Lorem ipsum dolor sit amet, consectetur</p>\n");
      out.write("                                </span>\n");
      out.write("                            </a>\n");
      out.write("                          </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-sm-5\">\n");
      out.write("                    <div class=\"user-area dropdown float-right\">\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                            <img class=\"user-avatar rounded-circle\" src=\"images/admin.jpg\" alt=\"User Avatar\">\n");
      out.write("                        </a>\n");
      out.write("\n");
      out.write("                        <div class=\"user-menu dropdown-menu\">\n");
      out.write("                                <a class=\"nav-link\" href=\"#\"><i class=\"fa fa- user\"></i>My Profile</a>\n");
      out.write("\n");
      out.write("                                <a class=\"nav-link\" href=\"#\"><i class=\"fa fa- user\"></i>Notifications <span class=\"count\">13</span></a>\n");
      out.write("\n");
      out.write("                                <a class=\"nav-link\" href=\"#\"><i class=\"fa fa -cog\"></i>Settings</a>\n");
      out.write("\n");
      out.write("                                <a class=\"nav-link\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/LogoutServlet\"><i class=\"fa fa-power -off\"></i>Logout</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"language-select dropdown\" id=\"language-select\">\n");
      out.write("                        <a class=\"dropdown-toggle\" href=\"#\" data-toggle=\"dropdown\"  id=\"language\" aria-haspopup=\"true\" aria-expanded=\"true\">\n");
      out.write("                            <i class=\"flag-icon flag-icon-us\"></i>\n");
      out.write("                        </a>\n");
      out.write("                        <div class=\"dropdown-menu\" aria-labelledby=\"language\" >\n");
      out.write("                            <div class=\"dropdown-item\">\n");
      out.write("                                <span class=\"flag-icon flag-icon-fr\"></span>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"dropdown-item\">\n");
      out.write("                                <i class=\"flag-icon flag-icon-es\"></i>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"dropdown-item\">\n");
      out.write("                                <i class=\"flag-icon flag-icon-us\"></i>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"dropdown-item\">\n");
      out.write("                                <i class=\"flag-icon flag-icon-it\"></i>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </header><!-- /header -->\n");
      out.write("        <!-- Header-->\n");
      out.write("\n");
      out.write("        <div class=\"breadcrumbs\">\n");
      out.write("            <div class=\"col-sm-4\">\n");
      out.write("                <div class=\"page-header float-left\">\n");
      out.write("                    <div class=\"page-title\">\n");
      out.write("                        <h1>Dashboard</h1>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-8\">\n");
      out.write("                <div class=\"page-header float-right\">\n");
      out.write("                    <div class=\"page-title\">\n");
      out.write("                        <ol class=\"breadcrumb text-right\">\n");
      out.write("                            <li><a href=\"shape/admin.jsp\">Dashboard</a></li>\n");
      out.write("                           \n");
      out.write("                        </ol>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"content mt-3\">\n");
      out.write("            <div class=\"animated fadeIn\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <div class=\"card-header\">\n");
      out.write("                            <strong class=\"card-title\">Registration Requests</strong>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            \n");
      out.write("                            <form method=\"post\">\n");
      out.write("                  <table id=\"bootstrap-data-table\" class=\"table table-striped table-bordered\">\n");
      out.write("                    <thead>\n");
      out.write("                      <tr>\n");
      out.write("                          <th>Type</th>\n");
      out.write("                        <th>University Name</th>\n");
      out.write("                        <th>Email</th>\n");
      out.write("                        <th>Username</th>\n");
      out.write("                        <th>Password</th>\n");
      out.write("                        <th> </th>\n");
      out.write("                      </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                    \n");

try
{
Class.forName("com.mysql.jdbc.Driver");
String url="jdbc:mysql://localhost/shapedb";
String username="root";
String password="";
String query="select * from unitemporary";
Connection conn=DriverManager.getConnection(url,username,password);
Statement stmt=conn.createStatement();
ResultSet rs=stmt.executeQuery(query);
while(rs.next())
{


      out.write("\n");
      out.write("    <tr>\n");
      out.write("        <td>");
      out.print(rs.getString("Type") );
      out.write("</td>\n");
      out.write("        <td>");
      out.print(rs.getString("Name") );
      out.write("</td>\n");
      out.write("        <td>");
      out.print(rs.getString("Email") );
      out.write("</td>\n");
      out.write("        <td>");
      out.print(rs.getString("Username") );
      out.write("</td>\n");
      out.write("        <td>");
      out.print(rs.getString("Password") );
      out.write("</td>\n");
      out.write("    \n");
      out.write("        <td> <a href=\"adduser.jsp?Type=");
      out.print(rs.getString("Type"));
      out.write("&Username=");
      out.print(rs.getString("Username"));
      out.write("&password=");
      out.print( rs.getString("Password"));
      out.write("\"> <input type=\"button\" class=\"btn btn-primary\" value=\"Add\" /> </a>\n");
      out.write("    \n");
      out.write("            <a href=\"deleteuser.jsp?Username=");
      out.print(rs.getString("Username"));
      out.write("\"> <input type=\"button\" name=\"b2\" class=\"btn btn-primary\" value=\"Delete\" /> </a>\n");
      out.write("        </td>\n");
      out.write("    </tr>\n");
      out.write("        ");


}

      out.write("\n");
      out.write("              \n");
      out.write("                    \n");
      out.write("                \n");
      out.write("                       \n");
      out.write("                           \n");
      out.write("                            \n");
      out.write("                        </tbody>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                         ");

    rs.close();
    stmt.close();
    conn.close();
    }
catch(Exception e)
{
    e.printStackTrace();
    }





      out.write("\n");
      out.write("                   \n");
      out.write("                    \n");
      out.write("                  </table>\n");
      out.write("\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"card-body\">\n");
      out.write("                            \n");
      out.write("                            <form method=\"post\">\n");
      out.write("                  <table id=\"bootstrap-data-table\" class=\"table table-striped table-bordered\">\n");
      out.write("                    <thead>\n");
      out.write("                      <tr>\n");
      out.write("                          <th>Type</th>\n");
      out.write("                        <th>Company Name</th>\n");
      out.write("                        <th>Email</th>\n");
      out.write("                        <th>Username</th>\n");
      out.write("                        <th>Password</th>\n");
      out.write("                        <th> </th>\n");
      out.write("                      </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                    \n");

try
{
Class.forName("com.mysql.jdbc.Driver");
String url="jdbc:mysql://localhost/shapedb";
String username="root";
String password="";
String query="select * from comtemporary";
Connection conn=DriverManager.getConnection(url,username,password);
Statement stmt=conn.createStatement();
ResultSet rs=stmt.executeQuery(query);
while(rs.next())
{


      out.write("\n");
      out.write("    <tr>\n");
      out.write("     <td>");
      out.print(rs.getString("Type") );
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getString("Name") );
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getString("Email") );
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getString("Username") );
      out.write("</td>\n");
      out.write("    <td>");
      out.print(rs.getString("Password") );
      out.write("</td>\n");
      out.write("    \n");
      out.write("    <td> <a href=\"adduser.jsp?Type=");
      out.print(rs.getString("Type"));
      out.write("&Username=");
      out.print(rs.getString("Username"));
      out.write("&password=");
      out.print( rs.getString("Password"));
      out.write("\"> <input type=\"button\" name=\"b3\" value=\"Add\" /> </a>\n");
      out.write("    \n");
      out.write("        <a href=\"deleteusercom.jsp?Username=");
      out.print(rs.getString("Username"));
      out.write("\">  <input type=\"button\" name=\"b4\" value=\"Delete\" /> </a>\n");
      out.write("      </td>\n");
      out.write("      \n");
      out.write("  \n");
      out.write("    \n");
      out.write("    </tr>\n");
      out.write("        ");


}

      out.write("\n");
      out.write("              \n");
      out.write("                    \n");
      out.write("                \n");
      out.write("                       \n");
      out.write("                           \n");
      out.write("                            \n");
      out.write("                        </tbody>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                         ");

    rs.close();
    stmt.close();
    conn.close();
    }
catch(Exception e)
{
    e.printStackTrace();
    }





      out.write("\n");
      out.write("                   \n");
      out.write("                    \n");
      out.write("                  </table>\n");
      out.write("\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div><!-- .animated -->\n");
      out.write("        </div><!-- .content -->\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div><!-- /#right-panel -->\n");
      out.write("\n");
      out.write("    <!-- Right Panel -->\n");
      out.write("\n");
      out.write("\n");
      out.write("    <script src=\"assets/js/vendor/jquery-2.1.4.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/popper.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/plugins.js\"></script>\n");
      out.write("    <script src=\"assets/js/main.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <script src=\"assets/js/lib/data-table/datatables.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/lib/data-table/dataTables.bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/lib/data-table/dataTables.buttons.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/lib/data-table/buttons.bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/lib/data-table/jszip.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/lib/data-table/pdfmake.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/lib/data-table/vfs_fonts.js\"></script>\n");
      out.write("    <script src=\"assets/js/lib/data-table/buttons.html5.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/lib/data-table/buttons.print.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/lib/data-table/buttons.colVis.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/lib/data-table/datatables-init.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        $(document).ready(function() {\n");
      out.write("          $('#bootstrap-data-table-export').DataTable();\n");
      out.write("        } );\n");
      out.write("    </script>\n");
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
