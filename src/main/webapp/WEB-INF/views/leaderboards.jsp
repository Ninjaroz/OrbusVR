<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="mytags" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Leaderboard</title>
</head>
<body>
<mytags:navbar/>


<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/leaderboards.js"></script>

<script>
$(document).ready(function(){	
	
	//Load high scores
	getArcherHighScores('${archerList}');
	getBarbarianHighScores('${barbarianList}');
	getFisherHighScores('${fisherList}');
	getOrbhealerHighScores('${orbhealerList}');
	getRunemageHighScores('${runemageList}');
	getSwordboardHighScores('${swordboardList}');
	getUnarmedHighScores('${unarmedList}');
});

</script>

<div id ="archerHighScores">		
</div>

<div id ="barbarianHighScores">		
</div>

<div id ="fisherHighScores">		
</div>

<div id ="orbhealerHighScores">		
</div>

<div id ="runemageHighScores">		
</div>

<div id ="swordboardHighScores">		
</div>

<div id ="unarmedHighScores">		
</div>

</body>
</html>