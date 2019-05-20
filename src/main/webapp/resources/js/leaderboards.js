function loadHighScores(list){
	
	var monstersKilledList = [];
	var gatheringList = [];
	var fishingList = [];
	
	//add records to an array
	 //for (var i = 0; i < list.length; i++){
	   list.forEach(function(record){
		for (var x = 0; x < record.stats.length; x++){
			var newRecord = {name: record.name, record: record.stats[x].record};
			switch(record.stats[x].name){
				case "fish_totalweight":
					fishingList.push(newRecord);
					break;
				case "monsters_killed":
					monstersKilledList.push(newRecord);
					break;
				case "gathers":
					gatheringList.push(newRecord);
					break;
				default:
					break;
			}
		}	 
	 });
	 
	 //Create record tables
	 createHighScoreTable("monstersKilledHighScores",monstersKilledList);
	 createHighScoreTable("gatheringHighScores",gatheringList);
	 createHighScoreTable("fishingHighScores",fishingList);
}

function createHighScoreTable(table, recordList){
	
	//clear div element of existing table
	//$('#'+table).html("");
	
	recordList = sortListByRecord(recordList);
	//var dataSet = [];
	i = 1;
		
	//create new table and add to div element
	var newTable = "<table id='"+table+"table'><tr><th>Ranking</th><th>Name</th><th>Score</th></tr>";	
	recordList.forEach(function(record){
		newTable = newTable.concat("<tr><td>"+i+"</td><td>"+record.name+"</td><td>"+record.record+"</td></tr>");
		i++;
	});	
	newTable = newTable.concat("</table>");
	
	$('#'+table).append(newTable);
	
	/*$('#'+table+"table").Datatable({
		data: dataSet,
		columns: [
			{title: "ranking"},
			{title: "name"},
			{title: "score"}
		]
	});	*/
}

function sortListByRecord(highScoreList){
	 var byRecord = highScoreList.slice(0);
		 //sort by record
		 byRecord.sort(function(a,b){
			 return b.record-a.record;
		 });
	return byRecord;
}



