<%-- 
    Document   : home
    Created on : Jul 5, 2018, 3:42:02 PM
    Author     : sanda
--%>

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
		<div class="container">
			<div class="row">
				<div class="col-xs-12 text-center">
					<div id="fh5co-logo"><a href="">UNI-CO<span>.</span></a></div>
				</div>
				<div class="col-xs-12 text-center menu-1">
					<ul>
						<li class="active"><a href="home.jsp">Home</a></li>
						
                                                <li><a href="universities.jsp">Universities</a></li>
						<li><a href="companies.jsp">Companies</a></li>
						<li><a href="ideahub.jsp">Idea Hub</a></li>

						
                                                <li><a href="${pageContext.request.contextPath}/LogoutServlet">Logout</a></li> 
					</ul>
				</div>
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
							<p>
                                                            <a href="" class="btn btn-primary">Welcome</a> <br> 
								
							</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</header>

	

	<div id="fh5co-services" class="fh5co-bg-section">
		<div class="container">
			<div class="row row-pb-md">
				<div class="col-md-8 col-md-offset-2 text-center animate-box" data-animate-effect="fadeInUp">
					<div class="fh5co-heading">
						<span>We're expert</span>
						<h2>What We Do</h2>
						<p>We are a platform that provides universities and companies with the facility to connect with each other to drive innovation. </p>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-md-4 col-sm-4 ">
					<div class="feature-center animate-box" data-animate-effect="fadeInUp">
						<span class="icon">
							<i class="icon-eye"></i>
						</span>
						<h3>Are you from a University?</h3>
						<p>We've got great companies collaborating with our platform that provides 
                                                    various offers and internships for university students.<br>
                                                Take a look and find your dream job!</p>
						<p><a href="companies.jsp">Learn More</a></p>
					</div>
				</div>
				<div class="col-md-4 col-sm-4 ">
					<div class="feature-center animate-box" data-animate-effect="fadeInUp">
						<span class="icon">
							<i class="icon-command"></i>
						</span>
						<h3>Are you from a Company?</h3>
                                                <p>Looking for the perfect employee for your next job vacancy?<br>
                                                Go through the universities using our platform for their details and find the best fit!</p>
						<p><a href="universities.jsp">Learn more</a></p>
					</div>
				</div>
				<div class="col-md-4 col-sm-4 ">
					<div class="feature-center animate-box" data-animate-effect="fadeInUp">
						<span class="icon">
							<i class="icon-power"></i>
						</span>
						<h3>Got any Suggestions?</h3>
						<p>Your ideas are important to us!<br>
                                                    Visit our Ideahub and make sure to post your questions, comments, ideas or suggestions. </p>
						<p><a href="ideahub.jsp">Learn more</a></p>
					</div>
				</div>


			</div>
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
