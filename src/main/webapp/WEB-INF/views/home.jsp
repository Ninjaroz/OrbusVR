<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="mytags" tagdir="/WEB-INF/tags" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<mytags:navbar/>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/orbusVRAPIQueries.js"></script>
<script>
$(document).ready(function(){		
	getServerStatus(setServerTime);
	
	function setServerTime(sInfo){
		$("#serverTime").append("<b>Current Game Status</b><br>Server Date:  " + 
				sInfo.monthOfYear + "/" + sInfo.dayOfMonth + "/" + sInfo.yearNumber +"<br>"+
				"Server Time: " + sInfo.time + "<br>" +
				"Number of players online: " + sInfo.playersOnline);
	}
});


</script>

<h1>
	Welcome, to my fan based OrbusVR site
</h1>

<P id ="serverTime"></P>
</body>
</html>
