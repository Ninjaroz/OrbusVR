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

<body>
<mytags:navbar/>
	<table>
		<tr>
			<td>
				<select id="instanceList">
					<c:forEach items="${instances}" var="obj">
						<option value="${obj.instanceId}">${obj.name}</option>
					</c:forEach>			
				</select>
			</td>
	   </tr>
	</table>	

</body>
</html>