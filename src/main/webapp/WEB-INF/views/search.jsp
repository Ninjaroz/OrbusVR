<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="mytags" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search</title>
</head>
<style>
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/orbusVRAPIQueries.js"></script>
<script>
$(document).ready(function(){	
	$("#searchBtn").click(function(){
		searchAPI($("#searchByText"),saveUser);
	});
	
	$(document).on('click', '#deleteUser', function(){ 
		deleteUser($(this).val());
	}); 	
});

</script>
<body>
	<mytags:navbar/>
	<table>
		<tr>
			<td><input id="searchByText"/></td>
			<td><button id="searchBtn">Submit</button>
	   </tr>
	</table>	
	
	<div id ="searchContainer">
		
	</div>
	
</body>
</html>