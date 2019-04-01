function getArcherHighScores(list){
	//convert java list json to javascript list
	//var objList = JSON.parse(list);
	//Clear contents of archerHighScores
	$("#archerHighScores").html("");
	$("#archerHighScores").append("<ul id='archerHighScoresList'>");
	alert(list.size());
	objList.forEach(function(user){
		$("#archerHighScoresList").append("<li>" + user.characterName + " Archer Level: " + user.levels.archer + "</li>");
	});	
	$("#archerHighScoresList").append("</ul>");
}

function getBarbarianHighScores(list){
	//convert java list json to javascript list
	//var objList = JSON.parse(list);
	//Clear contents of archerHighScores
	$("#barbarianHighScores").html("");
	$("#barbarianHighScores").append("<ul id='barbarianHighScoresList'>");
	alert(list.size());
	objList.forEach(function(user){
		$("#barbarianHighScoresList").append("<li>" + user.characterName + " barbarian Level: " + user.levels.barbarian + "</li>");
	});	
	$("#barbarianHighScoresList").append("</ul>");
}

function getFisherHighScores(list){
	//convert java list json to javascript list
	//var objList = JSON.parse(list);
	//Clear contents of archerHighScores
	$("#fisherHighScores").html("");
	$("#fisherHighScores").append("<ul id='fisherHighScoresList'>");
	alert(list.size());
	objList.forEach(function(user){
		$("#fisherHighScoresList").append("<li>" + user.characterName + " fisher Level: " + user.levels.fisher + "</li>");
	});	
	$("#fisherHighScoresList").append("</ul>");
}

function getOrbhealerHighScores(list){
	//convert java list json to javascript list
	//var objList = JSON.parse(list);
	//Clear contents of archerHighScores
	$("#orbhealerHighScores").html("");
	$("#orbhealerHighScores").append("<ul id='orbhealerHighScoresList'>");
	alert(list.size());
	objList.forEach(function(user){
		$("#orbhealerHighScoresList").append("<li>" + user.characterName + " orbhealer Level: " + user.levels.orbhealer + "</li>");
	});	
	$("#orbhealerHighScoresList").append("</ul>");
}

function getRunemageHighScores(list){
	//convert java list json to javascript list
	//var objList = JSON.parse(list);
	//Clear contents of archerHighScores
	$("#runemageHighScores").html("");
	$("#runemageHighScores").append("<ul id='runemageHighScoresList'>");
	alert(list.size());
	objList.forEach(function(user){
		$("#runemageHighScoresList").append("<li>" + user.characterName + " runemage Level: " + user.levels.runemage + "</li>");
	});	
	$("#runemageHighScoresList").append("</ul>");
}

function getSwordboardHighScores(list){
	//convert java list json to javascript list
	//var objList = JSON.parse(list);
	//Clear contents of archerHighScores
	$("#swordboardHighScores").html("");
	$("#swordboardHighScores").append("<ul id='swordboardHighScoresList'>");
	alert(list.size());
	objList.forEach(function(user){
		$("#swordboardHighScoresList").append("<li>" + user.characterName + " swordboard Level: " + user.levels.swordboard + "</li>");
	});	
	$("#swordboardHighScoresList").append("</ul>");
}

function getUnarmedHighScores(list){
	//convert java list json to javascript list
	//var objList = JSON.parse(list);
	//Clear contents of archerHighScores
	$("#unarmedHighScores").html("");
	$("#unarmedHighScores").append("<ul id='unarmedHighScoresList'>");
	alert(list.size());
	objList.forEach(function(user){
		$("#unarmedHighScoresList").append("<li>" + user.characterName + " unarmed Level: " + user.levels.unarmed + "</li>");
	});	
	$("#unarmedHighScoresList").append("</ul>");
}

