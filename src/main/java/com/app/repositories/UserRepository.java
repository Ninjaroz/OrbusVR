package com.app.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.app.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	@Query(value = "Select * FROM OrbusVRInfo.user where name = ?1", nativeQuery = true)
	List<User> findByName(String name);	
	
	@Query(value = "Select * FROM OrbusVRInfo.user", nativeQuery = true)
	List<User>getAllUsers();
}
