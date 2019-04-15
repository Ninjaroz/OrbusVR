package com.app.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
 * Handles search controller view page
 * @author Gary Sundquist
 */
@Controller
public class SearchController {
	
	private static final Logger logger = LoggerFactory.getLogger(SearchController.class);
	/*
	 * displays search view page
	 */
	@RequestMapping(value = "/Search", method = RequestMethod.GET )
	public String search(Model model) {
		logger.debug("loading search page...");
		return "search";
	}
		
}
