package com.OrbusVR.app;

import java.io.IOException;
import java.sql.Date;
import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.OrbusVR.models.User;
import com.OrbusVR.services.UserService;

@Controller
public class SearchController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/Search", method = RequestMethod.GET )
	public String search(Model model) {
		return "search";
	}
	
	//@RequestMapping(value = "/SaveUser", method = RequestMethod.POST)
	public void SaveUser(@RequestParam("user") String userStr) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			User user = mapper.readValue(userStr, User.class);
			user.setStatsJson(mapper.writeValueAsString(user.getStats()));
			user.setLevelsJson(mapper.writeValueAsString(user.getLevels()));
			user.setLastUpdated(new Date(System.currentTimeMillis()));
			if (userService.findByName(user.getCharacterName()) == null) 
				userService.save(user);
			
		} catch (IOException e) {
			logger.debug(e.toString());
		}
	}
	

}
