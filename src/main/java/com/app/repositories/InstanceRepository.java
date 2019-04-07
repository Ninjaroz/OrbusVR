package com.app.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.models.Instance;

@Repository
public interface InstanceRepository extends JpaRepository<Instance, Long>{ 	
	@Query(value = "Select * FROM tguIL5g8C8.instance", nativeQuery = true)
	List<Instance>getAllInstances();
}
