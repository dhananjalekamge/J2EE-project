<%-- 
    Document   : ideahub
    Created on : Jul 5, 2018, 3:47:02 PM
    Author     : sanda
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>UNI-CO</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="Free HTML5 Website Template by FreeHTML5.co" />
	<meta name="keywords" content="free website templates, free html5, free template, free bootstrap, free website template, html5, css3, mobile first, responsive" />
	<meta name="author" content="FreeHTML5.co" />
	
	

  	

	<link href='https://fonts.googleapis.com/css?family=Work+Sans:400,300,600,400italic,700' rel='stylesheet' type='text/css'>
	
	<!-- Animate.css -->
	<link rel="stylesheet" href="css/animate.css">
	<!-- Icomoon Icon Fonts-->
	<link rel="stylesheet" href="css/icomoon.css">
	<!-- Bootstrap  -->
	<link rel="stylesheet" href="css/bootstrap.css">

	<!-- Magnific Popup -->
	<link rel="stylesheet" href="css/magnific-popup.css">

	<!-- Theme style  -->
	<link rel="stylesheet" href="css/style.css">

	<!-- Modernizr JS -->
	<script src="js/modernizr-2.6.2.min.js"></script>
	<!-- FOR IE9 below -->
	<!--[if lt IE 9]>
	<script src="js/respond.min.js"></script>
	<![endif]-->

	</head>
	<body>
		
	<div class="fh5co-loader"> </div>
	
	
	<nav class="fh5co-nav" role="navigation">
		<div class="container">
			<div class="row">
				<div class="col-xs-12 text-center">
					<div id="fh5co-logo"><a href="">UNI-CO<span>.</span></a></div>
				</div>
				<div class="col-xs-12 text-center menu-1">
					<ul>
						<li><a href="home.jsp">Home</a></li>
						

						<li><a href="universities.jsp">Universities</a></li>
						<li><a href="companies.jsp">Companies</a></li>
						<li class="active"><a href="ideahub.jsp">Idea Hub</a></li>
						<li><a href="${pageContext.request.contextPath}/LogoutServlet">Logout</a></li>
					</ul>
				</div>
			</div>
			
		</div>
	</nav>

	<header id="fh5co-header" class="fh5co-cover" role="banner" style="background-image:url(images/2.jpg);">
		<div class="overlay"></div>
		<div class="container">
			<div class="row">
				<div class="col-md-12 col-md-offset-0 text-center">
					<div class="display-t">
						<div class="display-tc animate-box" data-animate-effect="fadeInUp">
							<h1 class="mb30">Thoughts & Ideas</h1>
						</div>
					</div>
				</div>
			</div>
		</div>
	</header>

	

	<div id="fh5co-blog" class="fh5co-bg-section">
		<div class="container">
			<div class="row animate-box row-pb-md" data-animate-effect="fadeInUp">
				<div class="col-md-8 col-md-offset-2 text-center fh5co-heading">
					<span>Hello there!</span>
					<h2>Your ideas  <br> are important to </h2>
					<p> If you have any ideas or suggestions you wish to share, 
                                            or if you have any inquiries to make regarding an event or any other, 
                                            feel free to mention them below. <br>
                                             The relevant parties will contact you with a solution.</p>
                                        <br> <br>
                                        
                                        <form method="post" action="${pageContext.request.contextPath}/ideahub">
                                            
                                          
                                              <div class="row form-group">
							<div class="col-md-12">
								<label for="comment">Message</label>
								<textarea name="comment" id="message" cols="30" rows="5" class="form-control" placeholder=" Ask a Question"></textarea>
							</div>
						</div>
						<div class="form-group">
							<input type="submit" value="Post Comment" class="btn btn-primary">
                                                </div> 
                                            
                                            
                                        </form>
                                        
                                        

                                
				</div>
			</div>
                    
			</div>
		</div>
         
	
	

	
	<div id="fh5co-started">
		<div class="container">
			
				
					
                                    <table id="new">
                                           
                                            <%
try
{
Class.forName("com.mysql.jdbc.Driver");
String url="jdbc:mysql://localhost/shapedb";
String username="root";
String password="";
String query="select * from ideahub";
Connection conn=DriverManager.getConnection(url,username,password);
Statement stmt=conn.createStatement();
ResultSet rs=stmt.executeQuery(query);
while(rs.next())
{

%>

<tr>

    <td><%=rs.getString("user") %> : </td>  </tr>
<tr> <td><%=rs.getString("Comments") %></td> 
       

        <td> 
    
           <a href="deletecomment.jsp?user=<%=rs.getString("user")%>">  <input type="button"  value="Delete Comment" /> </a>
        </td>
    </tr>
    

        <%

}
%>
              
          
                        
                        
                         <%
    rs.close();
    stmt.close();
    conn.close();
    }
catch(Exception e)
{
    e.printStackTrace();
    }




%>
    

<style>
    
    td {
        padding-left: 8px;
        padding-bottom: 8px;
        padding-top: 8px;
        padding-right: 8px;
        color: #79ace9;
        font-size: 110%;
    }
    
    tr:nth-child(even) {
        background-color:  rgba(153, 153, 153,0.1);
        border-style: outset ;
        
    }
    
</style>


                                    </table> <br>
                                    
                                    
				
			
		</div>
	</div>


	<footer id="fh5co-footer" role="contentinfo">
		<div class="container">
			

			<div class="row copyright">
				<div class="col-md-12 text-center">
					<p>
						<small class="block">&copy; All Rights Reserved.</small> 
						
					</p>
					<p>
						<ul class="fh5co-social-icons">
							<li><a href="#"><i class="icon-twitter"></i></a></li>
							<li><a href="#"><i class="icon-facebook"></i></a></li>
							<li><a href="#"><i class="icon-linkedin"></i></a></li>
							<li><a href="#"><i class="icon-dribbble"></i></a></li>
						</ul>
					
				</div>
			</div>

		</div>
	</footer> 
	
	<div class="gototop js-top">
		<a href="#" class="js-gotop"><i class="icon-arrow-up"></i></a>
	</div>
	
	<!-- jQuery -->
	<script src="js/jquery.min.js"></script>
	<!-- jQuery Easing -->
	<script src="js/jquery.easing.1.3.js"></script>
	<!-- Bootstrap -->
	<script src="js/bootstrap.min.js"></script>
	<!-- Waypoints -->
	<script src="js/jquery.waypoints.min.js"></script>
	<!-- countTo -->
	<script src="js/jquery.countTo.js"></script>
	<!-- Magnific Popup -->
	<script src="js/jquery.magnific-popup.min.js"></script>
	<script src="js/magnific-popup-options.js"></script>
	<!-- Main -->
	<script src="js/main.js"></script>

	</body>
    
</html>
