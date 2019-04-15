package com.app.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.app.models.Instance;
import com.app.services.InstanceService;

/*
 * Handles the instances model view page
 * @author Gary Sundquist
 */
@Controller
public class InstancesController {

	private static final Logger logger = LoggerFactory.getLogger(InstancesController.class);
	
	@Autowired
	private InstanceService instanceService;
	/*
	 * @return instance view
	 */
	@RequestMapping(value = "/Instances", method = RequestMethod.GET)
	public String instances(Model model) {
		logger.debug("loading Instances page...");
		
		List<Instance> instances = instanceService.getAllInstances();
		model.addAttribute("instances", instances);

		return "instances";
	}
}
