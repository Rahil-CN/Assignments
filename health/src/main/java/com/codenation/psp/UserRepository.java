package com.codenation.psp;
import org.springframework.data.repository.CrudRepository;
import com.codenation.psp.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
