<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Connection"%>




<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
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
						<li><a href="home.jsp">Home</a></li>
						

						<li><a href="universities.jsp">Universities</a></li>
						<li class="active"><a href="companies.jsp">Companies</a></li>
						<li><a href="ideahub.jsp">Idea Hub</a></li>
						<li><a href="${pageContext.request.contextPath}/LogoutServlet">Logout</a></li>
					</ul>
				</div>
			</div>
			
		</div>
	</nav>

	<header id="fh5co-header" class="fh5co-cover" role="banner" style="background-image:url(images/3.jpg);">
		<div class="overlay"></div>
		<div class="container">
			<div class="row">
				<div class="col-md-12 col-md-offset-0 text-center">
					<div class="display-t">
						<div class="display-tc animate-box" data-animate-effect="fadeInUp">
							<h1 class="mb30">Working in a Company?</h1>
						</div>
					</div>
				</div>
			</div>
		</div>
	</header>

	

	<div id="fh5co-about">
		<div class="container">
				<div class="row row-pb-md">
					<div class="col-md-8 col-md-offset-2 text-center fh5co-heading">
						<span>Know us</span>
						<h2>Companies using our platform</h2>
						
					</div>
				</div>
				
                                    
                    <button class="accordion"> <b> Virtusa </b></button>
<div class="panel">
    <br>
  <p> At Virtusa we accelerate business outcomes for our clients through our expert 
      information technology consulting and outsourcing services. 
      We support a wide variety of Forbes Global 2000 firms with services
      that span the entire spectrum of the IT services  lifecycle. 
      Our industry-leading solutions transform businesses not only for a better today,
      but also for a better future. <br> Take a look through our events to be held.</p>
  
                 
                                      <div class="container">

     

     
        <br>
        
            <div class="facilities12">
        
               
                <div class="lc">
                    <a href="Addevent.jsp">Add OR Delete Events</a><br>
                    <form action="events.jsp" class="form1">
            
            <input type="date" name="date">
            <input type="submit" value="search" />
        </form>
                    <br><br>
                          <%
            String user=(String) session.getAttribute("un");
          Connection conn=null;
              PreparedStatement pst=null;
              ResultSet rs=null;
           
                        
            Class.forName("com.mysql.jdbc.Driver");
            conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/shapedb","root","");
            
            
            try{
          String sql="SELECT  * FROM date ";
         
               pst=conn.prepareStatement(sql);
                rs = pst.executeQuery();
                
           %>
            <table border="1" class="table1">
                <tr><td><b>DATE</b></td><td><b>EVENTS</b></td>
           <%
                
                while(rs.next()){
                    %>
                    
                        <tr><td>
                    <%

             out.print(rs.getString(1));
             %>
                            </td>
                            <td>
                                <a href="ComEvent.jsp"><%
             out.print(rs.getString(2));
                                %> </a></td>
                           
                        </tr>
             <%
           
             
            }
             %>
                        </table>
              <%
                

               
                conn.close();
                
            
            }
            catch(Exception e){
                System.out.println("hello");
            }


         %>
                    
                        <tr><td>
                    
                
 <style>
     td{
         padding-top: 7px;
         padding-bottom: 7px;
         padding-left: 5px;
         padding-right: 10px;
     } 
     
                            
</style>                             
                                
                                
                </div>
                <div class="l2"> </div>
        
            </div>

        <br>

      

        <br><br><br>

    </div>
  
  
 
</div>




         <button class="accordion"> <b>WSO2</b></button>
<div class="panel">
    
  <p>......</p>
</div>

         <button class="accordion"> <b>MillenniumIT</b> </button>
<div class="panel">
  <p>......</p>
</div>

<style>
    
.panel {
    padding: 0 18px;
    background-color: white;
    max-height: 0;
    overflow: hidden;
    transition: max-height 0.2s ease-out;
}

.accordion {
    background-color: #eee;
    color: #444;
    cursor: pointer;
    padding: 18px;
    width: 100%;
    text-align: left;
    border: none;
    outline: none;
    transition: 0.4s;
}


</style>

<script>
var acc = document.getElementsByClassName("accordion");
var i;

for (i = 0; i < acc.length; i++) {
  acc[i].addEventListener("click", function() {
    this.classList.toggle("active");
    var panel = this.nextElementSibling;
    if (panel.style.maxHeight){
      panel.style.maxHeight = null;
    } else {
      panel.style.maxHeight = panel.scrollHeight + "px";
    } 
  });
}
</script>

					
                                    
			
		
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

