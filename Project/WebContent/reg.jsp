<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="spr" uri="http://www.springframework.org/tags/form" %> 

<!doctype html>
<html lang="en">
<head>
<title>Helping Hands!!!</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- font files -->
<link href="//fonts.googleapis.com/css?family=Spectral" rel="stylesheet">
<!-- /font files -->
<!-- css files -->
<link href="css/style.css" rel='stylesheet' type='text/css' media="all" />
<!-- /css files -->
<link href="css/wickedpicker.css" rel="stylesheet" type='text/css' media="all" />
<script type="text/javascript" src="js/jquery-2.1.4.min.js"></script>
</head>
<body>
	<div class="w3-banner-main">
		<div class="center-container">
			<h1 class="header-w3ls">Registration Form</h1>
			<div class="content-top">
				<div class="content-w3ls">
					<div class="form-w3ls">
						<spr:form action="reg.htm" method="post" commandName="user" >
							<div class="content-wthree1">
								<div class="grid-agileits1">
									<div class="form-control"> 
										<label class="header"> Name </label>
										<spr:input path="Name" id="name" name="name" placeholder="" title="Please enter your Full Name" required=""  />
									</div>

                                    <div class="form-control"> 
										<label class="header"> UserName </label>
										<spr:input path="UserName" id="name" name="name" placeholder="" title="Please enter your Full Name" required=""/>
									</div>
									
									 <div class="form-control"> 
										<label class="header"> Password </label>
										<spr:password path="Password" id="name" name="name" placeholder="" title="Please enter your Full Name" required=""/>
									</div>
									
									<div class="form-control">	
										<label class="header"> Email </label>
										<spr:input path="Email" id="email" name="email" placeholder="" title="Please enter a Valid Email Address" required=""/>
									</div>
									
									
								 <div class="form-control" id="hiddenDiv3" style="display:none">
                                        <label class="header">Gender</label>
                                        <spr:select path="Gender" class="form-control">
                                           <spr:option  value=""></spr:option>
                                            <spr:option value="Male"></spr:option>
                                            <spr:option value="Female"></spr:option>  
                                            <spr:option value="Other"></spr:option>     
                                        </spr:select>
                                    </div>
                                    
                                    <div class="form-control">
                                        <label class="header">Type</label>
                                        <spr:select path="UserRole" class="form-control" onchange="java_script_:show(this.options[this.selectedIndex].value)">
                                            <spr:option  value=""></spr:option>
                                            <spr:option value="Donor"></spr:option>
                                            <spr:option value="NGO"></spr:option>     
                                        </spr:select>
                                    </div>

								</div>
							</div>
					</div>
					<div class="form-w3ls-1">
						
								
						<div class="form-control"> 
							<label class="header">Address </label>
							<spr:input path="Address" id="name" name="name" placeholder="" title="Please enter your Full Name" required=""/>
						</div>	
						<div class="form-control"> 
							<label class="header">Zip code </label>
							<spr:input path="Pincode" id="name" name="name" placeholder="" title="Please enter your Full Name" required=""/>
						</div>
						<div class="form-control">
								<label class="header">City </label>		
									<spr:select path="City" class="form-control">
                                           <spr:option  value=""></spr:option>
                                            <spr:option value="Mumbai"></spr:option>
                                            <spr:option value="Pune"></spr:option>  
                                            <spr:option value="Other"></spr:option>     
                                        </spr:select>
						</div>
							<div class="form-control" id="hiddenDiv" style="display:none"> 
									<label class="header"> Age </label>
                                <spr:input  path="Age" id="name" name="name" placeholder="" title="Please enter your Full Name" required=""/>
							</div>

                        <div class="form-control" id="hiddenDiv1" style="display:none">
                            <label class="header"> Registration Number </label>
                            <spr:input  path="Registration_No" id="name" name="name" placeholder="" title="Please enter your Full Name" required=""/>
                        </div>

                        <div class="form-control" id="hiddenDiv2" style="display:none">
                            <label class="header"> Landline Number  </label>
                            <spr:input  path="Telephone_No" id="name" name="name" placeholder="" title="Please enter your Full Name" required=""/>
                        </div>
                        
									  <input type="submit" value="Registration">
									  </spr:form>
					</div>				
					<div class="clear"></div>
				</div>
			</div>	
				
				<p class="copyright">© 2018  Registration Form. All Rights Reserved | Design by <a href="https://www.facebook.com/sangamnath.nagathan" target="_blank">Sangam</a></p>
		</div>
	</div>


			
    <SCRIPT>
	function show(select_item) {
	    if (select_item == "Donor") {
		    hiddenDiv.style.visibility='visible';
		    hiddenDiv.style.display = 'block';
		    hiddenDiv3.style.visibility = 'visible';
		    hiddenDiv3.style.display = 'block';
		    hiddenDiv1.style.visibility = 'hidden';
		    hiddenDiv1.style.display = 'none';
		    hiddenDiv2.style.visibility = 'hidden';
		    hiddenDiv2.style.display = 'none';
			Form.fileURL.focus();
	    }
	    else if (select_item == "NGO") {
	        hiddenDiv1.style.visibility = 'visible';
	        hiddenDiv1.style.display = 'block';
	        hiddenDiv2.style.visibility = 'visible';
	        hiddenDiv2.style.display = 'block';
	        hiddenDiv.style.visibility = 'hidden';
	        hiddenDiv.style.display = 'none';
	        hiddenDiv3.style.visibility = 'hidden';
	        hiddenDiv3.style.display = 'none';
	        Form.fileURL.focus();
	    }
		else{
			hiddenDiv.style.visibility='hidden';
			hiddenDiv.style.display='none';
		}
	}
    </SCRIPT>  

</body>
</html>