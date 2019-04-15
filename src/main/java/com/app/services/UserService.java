package com.app.services;

import com.app.models.User;
import com.app.repositories.UserRepository;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 * Service for user database transactions
 * @author Gary Sundquist
 */
@Service 
public class UserService{
	
	private static final Logger logger = LoggerFactory.getLogger(UserService.class);
	
	@Autowired 
	UserRepository userRepository;
		
    public User save(User user) {
    	return userRepository.save(user);
      }   
       
    public List<User> findByName(String name) {
    	return userRepository.findByName(name);
    }
    
    public void deleteUser(long userId) {
    	userRepository.deleteById(userId);
    }   
    
    public List<User> getAllUsers(){
    	return userRepository.getAllUsers();
    }
}
