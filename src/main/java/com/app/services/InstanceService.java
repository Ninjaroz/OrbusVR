package com.app.services;

/*
 * Service for Instance database transactions
 * @author Gary Sundquist
 */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.models.Instance;
import com.app.repositories.InstanceRepository;

@Service 
public class InstanceService {
	
	@Autowired 
	InstanceRepository instanceRepository;
	
    public List<Instance> getAllInstances(){
    	return instanceRepository.getAllInstances();
    
    }
}
