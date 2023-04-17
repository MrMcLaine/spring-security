package ua.security.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ua.security.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User findByUserName(String userName);
}
