package com.app.repositories;

/*
 * User database transactions
 * @author Gary Sundquist
 */
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.app.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	@Query(value = "Select * FROM yD4GbaoJGj.user where name = ?1", nativeQuery = true)
	//@Query(value = "Select * FROM orbusvrinfo.user where name = ?1", nativeQuery = true)	
	List<User> findByName(String name);	
	
	@Query(value = "Select * FROM yD4GbaoJGj.user", nativeQuery = true)
	//@Query(value = "Select * FROM orbusvrinfo.user", nativeQuery = true)
	List<User>getAllUsers();
}
