package com.app.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.models.User;
import com.app.services.UserService;
import com.app.utils.JacksonUtils;


@Controller
public class LeaderboardsController {

	private static final Logger logger = LoggerFactory.getLogger(LeaderboardsController.class);
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/Leaderboards", method = RequestMethod.GET)
	public String leaderboards(Model model) {
		logger.debug("loading Leaderboards page...");
		
		List<User> userList = userService.getAllUsers();		
		model.addAttribute("archerList",userList);
		
		return "leaderboards";
	}
	
	//TODO: Sort each class by level 
	/*private List<User>SortListByLevel(List<User> userList){
		List<User> sortedList = null;
		for (User user : userList) {
			
		}
		
		return sortedList;
	}*/
	
	
}

