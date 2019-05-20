<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="mytags" tagdir="/WEB-INF/tags" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Instances</title>
</head>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
$(document).ready(function(){	
	$("#instanceList").on('change', function(){
		$("#instanceImg").attr('src', "${pageContext.request.contextPath}/resources/imgs/"+this.value+'.jpg');
		$("#caption").append("");
		$("#caption").append("source= orbus online https://orbus.online/index.php?title=Map_of_the_World");
	});
});


</script>

<body>
<mytags:navbar/>
	<table>
		<tr>
			<td>
				<select id="instanceList">
					<c:forEach items="${instances}" var="obj">
						<option value="${obj.name}">${obj.name}</option>
					</c:forEach>			
				</select>
			</td>
	   </tr>
	</table>
	
	<div id="instancePicture"><img id="instanceImg"src=""><figcaption id="caption"></figcaption></div>
	
	<div id="instanceDetails"></div>	

</body>
</html>