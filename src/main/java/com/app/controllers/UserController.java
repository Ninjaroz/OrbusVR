package com.app.controllers;

import java.sql.Date;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.app.models.User;
import com.app.services.UserService;
import com.app.utils.JacksonUtils;
/*
 * Handles user database transactions
 * @author Gary Sundquist
 */
@Controller
public class UserController {
	private static final Logger log = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	/*
	 * @param user obj json string
	 */
	@RequestMapping(value = "/SaveUser", method = {RequestMethod.POST, RequestMethod.GET})
	public void SaveUser(@RequestParam("user") String userStr) {
			User user = JacksonUtils.getObj(userStr, User.class);
			if (user != null) {
				user.setLastUpdated(new Date(System.currentTimeMillis()));
				List<User> existingUserlst = userService.findByName(user.getName());
				if (existingUserlst.size() > 0) {
					//update existing user
					user.setUserId(existingUserlst.get(0).getUserId());
				}
				log.debug("Updating or creating user: " + user.getName());
				userService.save(user);
			}else {
				log.debug("Error parsing json data into user. User was not updated or created");
			}
	}
	/*
	 * @param user name
	 */
	@RequestMapping(value = "/DeleteUser", method = {RequestMethod.POST, RequestMethod.GET})
	public void DeleteUser(@RequestParam("name") String name) {
			List<User> existingUserlst = userService.findByName(name);
			if (existingUserlst.size() > 0) {
				//deleting existing user
				log.debug("Deleting user: " + existingUserlst.get(0).getName());
				userService.deleteUser(existingUserlst.get(0).getUserId());
			}		
	}
}
