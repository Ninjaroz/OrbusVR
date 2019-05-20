import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import com.app.models.User;
import com.app.repositories.UserRepository;
import com.app.services.UserService;

@DataJpaTest
class testUser {
	
	 @Autowired
	    private static TestEntityManager entityManager;
	 
	    @Autowired
	    private static UserRepository userRepository;
			
	    @Test
		public static void main(String[] args) {
			saveUser();
		}
		
		//save user
		public static void saveUser() {
			UserService userService = new UserService();
			User testUser = new User();
			testUser.setCharacterName("test");
			entityManager.persist(testUser);
			entityManager.flush();
			List<User> newUser = userService.findByName("test");
		}
		
		//delete user
		public static void deleteUser() {
			UserService userService = new UserService();
			List<User> testUser = userService.findByName("test");	
			userService.deleteUser(testUser.get(0).getUserId());
		}
		
		//Look up user
		public static List<User> lookUpUser() {
			UserService userService = new UserService();
			return userService.findByName("test");
		}

}
