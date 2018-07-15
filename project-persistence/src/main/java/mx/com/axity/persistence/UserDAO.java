package mx.com.axity.persistence;

import mx.com.axity.model.UserDO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends CrudRepository<UserDO, Long> {

}
