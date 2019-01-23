<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

</body>
<script>
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
    </script>  
</html>