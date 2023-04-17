package ua.security.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ua.security.domain.UserRole;

import java.util.List;

@Repository
public interface UserRolesRepository extends CrudRepository<UserRole, Long> {

    @Query("SELECT a.role from UserRole a, User b WHERE b.userName=?1 and a.userId=b.userId")
    List<String> findRoleByUserName(String userName);
}
