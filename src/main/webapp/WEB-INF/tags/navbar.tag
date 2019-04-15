<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">  
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  <link href="${pageContext.request.contextPath}/resources/css/navbar.css" rel="stylesheet" >
</head>

<!--  Handles active nav bar -->
<c:set var="currentURL" value="${requestScope['javax.servlet.forward.servlet_path']}"></c:set>
<c:if test="${currentURL.equals('/')}">
	<c:set var="activeLink" value="$('#navHome').addClass('active');"/>
</c:if>
<c:if test="${currentURL.equals('/Search')}">
	<c:set var="activeLink" value="$('#navSearch').addClass('active');"/>
</c:if>
<c:if test="${currentURL.equals('/Leaderboards')}">
	<c:set var="activeLink" value="$('#leaderboards').addClass('active');"/>
</c:if>
<c:if test="${currentURL.equals('/Quests')}">
	<c:set var="activeLink" value="$('#navQuests').addClass('active');"/>
</c:if>
<c:if test="${currentURL.equals('/Instances')}">
	<c:set var="activeLink" value="$('#navInstances').addClass('active');"/>
</c:if>
<c:if test="${currentURL.equals('/FAQ')}">
	<c:set var="activeLink" value="$('#navFAQ').addClass('active');"/>
</c:if>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
	//Sets this page as active link in navbar
	${activeLink}
});
</script>

<body>
	<div class="topNav">
      	<a href="/app" id="navHome">Home</a>     
      	<a href="/app/Search" id="navSearch">Search</a>
      	<a href="/app/Leaderboards" id="leaderboards">Leaderboards</a>
      	<a href="/app/Quests" id="navQuests">Quests</a>
      	<a href="/app/Instances" id="navInstances">Instances</a>
      	<a href="/app/FAQ" id="navFAQ" style="float:right;">FAQ</a>	
    </div>
  </body>
</html>