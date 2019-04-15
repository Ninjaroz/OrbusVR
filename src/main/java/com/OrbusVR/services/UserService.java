package com.OrbusVR.services;

import com.OrbusVR.app.HomeController;
import com.OrbusVR.models.User;
import com.OrbusVR.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService{
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired 
	UserRepository userRepository;

    public void save(User user) {
    	userRepository.save(user);
      }   

    public User findByName(String name) {
    	return new User();
    }
}
