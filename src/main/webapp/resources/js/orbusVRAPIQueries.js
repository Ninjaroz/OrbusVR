
//Gets character data from API
function searchAPI(searchType,searchbyText){
	//TODO: Query database to see if user already exists and if they have been updated within 
	//the last 24 hours
	$.ajax({
		url: "http://api-game.orbusvr.com/public/"+searchType+"/"+searchbyText.value,		
		type: "GET",
		success: function(result){
			alert(result);
			//saveUser(result);
		}
	});
}

/*Saves character data to database
function saveUser(user){
	$.ajax({
		url: "/app/SaveUser",
		type:"POST",
		data: {user: user}
	});
}*/

