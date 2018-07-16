<%-- 
    Document   : login
    Created on : Jul 5, 2018, 5:20:38 PM
    Author     : sanda
--%>

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
		
	<div class="fh5co-loader"></div>
	
	<div id="page">
	<nav class="fh5co-nav" role="navigation">
		
			<div class="row">
				<div class="col-xs-12 text-center">
					<div id="fh5co-logo"><a href="">UNI-CO<span>.</span></a></div>
                                </div> 
				
                        </div> 
			
		
	</nav>

	<header id="fh5co-header" class="fh5co-cover" role="banner" style="background-image:url(images/5.jpg);">
		<div class="overlay"></div>
		<div class="container">
			<div class="row">
				<div class="col-md-12 col-md-offset-0 text-center">
					<div class="display-t">
                                            <div class="display-tc animate-box" data-animate-effect="fadeInUp"> 
							<h1 class="mb30">connecting universities and companies to drive innovation</h1>
							
                                                        
                                                         <br> <br>
                                                        
                                                        <div id="login">

  <form id="new1" name="new" method="post" action="${pageContext.request.contextPath}/LoginServlet">
   
      <b> <label> USER TYPE : </label> </b> <br>
      <input type="radio" name="type" value="rd0" /> <label>Admin </label> 
      <input type="radio" name="type" value="rd1" /> <label> University </label> 
      <input type="radio" name="type" value="rd2" /> <label> Company </label><br>
  
     <b> <label> USERNAME : </label> </b> 
  <input type="text" placeholder="Enter Username" name="un"><br> <br>
  
  <b><label> PASSWORD : </label> </b>
  <input type="password" placeholder="Enter Password" name="ps"> <br><br>
  
  
  
  <input type="submit" class="log" value="Login">  <input type="reset" class="log" value="Cancel" />  
  
  <br> <br>
  
  </form>
  
  <b><label> Not a Member? </label></b> <br>
  
  <a href="register.jsp">
  <input type="button" value="Register Now" />
  </a>
 
 <style> 
 
 #login {
	
	max-width: 350px;
        margin: auto;
	padding-right:25px;
	padding-left:30px;
	padding-bottom:28px;
	
	
	
	
} 

.log{
	background-color:#008ae6 ;
	color: white;
	width:80px;
	height:35px;
	border: none;
	border-radius:3px;
	cursor:pointer;
	font-size:13px;
	
	
}

.log:hover{
	
	background-color: #007acc;
	
}
     
input[type=text] {
	
	
	width: 90%;
	padding: 12px 20px;
	border-radius: 6px;
	
	
}

input[type=password] {
	
	
	width: 90%;
	padding: 12px 20px;
	border-radius: 6px;
	
}

input[type=button] {
    background-color:#008ae6 ;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 50%;
	border-radius: 3px;
	font-size:13px;
}




 </style>

  
  </div>
  
                                                        
                                                        
                                                        
						</div>
                                            
                                            
                                            
                                            
					</div>
                                    
                                    
                                    
				</div>
			</div>
                    
                    
                    
		</div>
	</header>

	

	
	



	

	<footer id="fh5co-footer" role="contentinfo">
		<div class="container">
			

			<div class="row copyright">
				<div class="col-md-12 text-center">
					<p>
						<small class="block">&copy; 2016 Free HTML5. All Rights Reserved.</small> 
						<small class="block">Designed by <a href="http://freehtml5.co/" target="_blank">FreeHTML5.co</a> Demo Images: <a href="http://pixeden.com/" target="_blank">Pixeden</a> &amp; <a href="http://unsplash.com/" target="_blank">Unsplash</a></small>
					</p>
					<p>
						<ul class="fh5co-social-icons">
							<li><a href="#"><i class="icon-twitter"></i></a></li>
							<li><a href="#"><i class="icon-facebook"></i></a></li>
							<li><a href="#"><i class="icon-linkedin"></i></a></li>
							<li><a href="#"><i class="icon-dribbble"></i></a></li>
						</ul>
					</p>
				</div>
			</div>

		</div>
	</footer>
	</div>

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
