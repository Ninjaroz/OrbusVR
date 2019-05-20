
//Gets character data from API
function searchAPI(searchbyText,callback){
	//TODO: Query database to see if user already exists and if they have been updated within 
	//the last 24 hours
	$.ajax({
		url: "https://api-reborn.orbusvr.com/public/characters/"+searchbyText.val(),		
		type: "GET",
		success: function(result){
			//Clear contents of searchContainer
			$("#searchContainer").html("");
			var obj = JSON.parse(result);
			$("#searchContainer").append("<ul id='user'></ul>");
			$("#user").append("<li>" + obj.characterName + " <button id='deleteUser' value='"+obj.characterName+"'>Delete User</button>" +"</li>" +
							  "<li>Archer: " + obj.levels.archer + "</li>" +
							  "<li>Barbarian: " + obj.levels.barbarian + "</li>" +
							  "<li>Fisher: " + obj.levels.fisher + "</li>" +
							  "<li>Orbhealer: " + obj.levels.orbhealer + "</li>" +
							  "<li>Runemage: " + obj.levels.runemage + "</li>" +
							  "<li>Swordboard: " + obj.levels.swordboard + "</li>" +
							  "<li>Unarmed: " + obj.levels.unarmed + "</li>"
							  );
			//TODO: convert json to obj and populate + append table
			callback(result.toString());
		}
	});
}

//Gets Server information
function getServerStatus(callback){
	$.ajax({
		url: "https://api-reborn.orbusvr.com/servertime",		
		type: "GET",
		success: function(result){
			var obj = JSON.parse(result);
			callback(obj);
		}
	});
}

//Saves character data to database
function saveUser(result){
	$.ajax({
		url: "/app/SaveUser",
		type:"POST",
		data: {user: result}
	});
}

//deletes character from database
function deleteUser(cName){
	$.ajax({
		url: "/app/DeleteUser",
		type:"POST",
		data: {name: cName}
	});
}

