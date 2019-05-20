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

/*
 * 
 * Handles the leaderboards page view
 * @author Gary Sundquist
 */
@Controller
public class LeaderboardsController {

	private static final Logger logger = LoggerFactory.getLogger(LeaderboardsController.class);
	
	@Autowired
	private UserService userService;
	/*
	 * @Return Leaderboards view
	 */
	@RequestMapping(value = "/Leaderboards", method = RequestMethod.GET)
	public String leaderboards(Model model) {
		logger.debug("loading Leaderboards page...");
		
		List<User> userList = userService.getAllUsers();		
		if (userList.size() > 0) {
			model.addAttribute("userList",JacksonUtils.getObjString(userList));
		}else {
			logger.debug("No users to return");
		}
		return "leaderboards";
	}	
}


