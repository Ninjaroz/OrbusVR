<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<!-- TODO: Add a table under the $("#searchContainer) containing user details of user search-->
<script>
$(document).ready(function(){
	var table = 
		'<table>' +
			'<tr>UserName </tr>' +
			'<tr>Stats </tr>' +
		'</table>';
	
	$("#searchContainer").html(table);
});
</script>
</html>