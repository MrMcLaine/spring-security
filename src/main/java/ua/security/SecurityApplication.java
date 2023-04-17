package ua.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;
import ua.security.domain.User;
import ua.security.domain.UserRole;
import ua.security.repository.UserRepository;
import ua.security.repository.UserRolesRepository;

@SpringBootApplication
public class SecurityApplication implements CommandLineRunner {

	@Autowired
	UserRepository userRepository;

	@Autowired
	UserRolesRepository userRolesRepository;

	@Autowired
	PasswordEncoder passwordEncoder;

	public static void main(String[] args) {

		SpringApplication.run(SecurityApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
/*		User user = new User("user", passwordEncoder.encode("111"), "user@gmail.com", 1);
		User admin = new User("admin", passwordEncoder.encode("111"), "admin@gmail.com", 1);
		userRepository.save(user);
		userRepository.save(admin);*/
/*		UserRole roleForUser = new UserRole(4L, "ROLE_USER");
		UserRole roleForAdmin1 = new UserRole(5L, "ROLE_USER");
		UserRole roleForAdmin2 = new UserRole(5L, "ROLE_ADMIN");

		userRolesRepository.save(roleForUser);
		userRolesRepository.save(roleForAdmin1);
		userRolesRepository.save(roleForAdmin2);*/




	}
}
