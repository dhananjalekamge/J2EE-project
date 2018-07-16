
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
				
				<div class="row row-pb-md animate-box">
                                    
                                    
                                    
                                    <button class="accordion"> <b> Web Development workshop for Undergraduates</b> </button>
                                    <br> <br>
                                      <p>We are organizing a special web development workshop for undergraduates of different universities
                                          in order to expand their knowledge. The main intention of this workshop is to educate undergraduates 
                                          about key points of web development. 
                                      </p>
                                    
                                   
                                    
                                    <form method="post" action="${pageContext.request.contextPath}/status">
                                        
                                    
                                             <input type="radio" name="radio" value="going" /> 
                                            <label>Going</label> 
                                    
                                    
                                        <input type="radio" name="radio" value="interested" />
                                         <label>Interested</label> 
                                    
                                    
                                          <input type="radio" name="radio" value="not_going" /> 
                                        <label>Not Going</label>
                                    
       
                                    <br> <br>
                                    
                                        
                                     <div class="form-group">
							<input type="submit" value="Confirm" class="btn btn-primary">
                                                </div> 
                                      
                                    </form>
                                    <br>
                                    <hr>
                                  
                                    
                   
                    
           
                    
<br> 
<p>Post Comments regarding our event</p> 
               <form method="post" action="${pageContext.request.contextPath}/comment">
                <div class="row form-group">
							
                    <div class="col-md-12">
								
								
                        <textarea name="comment" id="message" cols="17" rows="3" class="form-control" placeholder="Say something about us"></textarea>
		    </div>
		</div>


              <div class="form-group">
		<input type="submit" value="Post " class="btn btn-primary">
              </div> 
<br>


<table id="new">
                                           
                                            <%
try
{
Class.forName("com.mysql.jdbc.Driver");
String url="jdbc:mysql://localhost/shapedb";
String username="root";
String password="";
String query="select * from comments";
Connection conn=DriverManager.getConnection(url,username,password);
Statement stmt=conn.createStatement();
ResultSet rs=stmt.executeQuery(query);
while(rs.next())
{

%>

<tr>

    <td><%=rs.getString("user") %> : </td> </tr>
<tr>  <td><%=rs.getString("comment") %></td>
       
 
        <td> 
    
           <a href="deleteEventComment.jsp?user=<%=rs.getString("user")%>">  <input type="button"  value="Delete Comment" /> </a>
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
        background-color:  rgba(64, 64, 64,0.1);
        border-style: none ;
        
    }
    
</style>


                                    </table> 
</form>
<br> <br>



<hr>

         <a href="companies.jsp"><button class="btn btn-primary">Go back to calendar</button></a>
<br><br><br>
      

        
            



        <br><br><br>

    <br><br>
                                     
                              
                                     
                                     
                                     
                                     
                                     

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
