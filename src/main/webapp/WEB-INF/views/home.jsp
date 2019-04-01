<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="mytags" tagdir="/WEB-INF/tags" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<mytags:navbar/>
<h1>
	Welcome, to my fan based OrbusVR site
</h1>

<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
