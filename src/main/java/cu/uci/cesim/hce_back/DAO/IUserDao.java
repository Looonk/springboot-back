package cu.uci.cesim.hce_back.DAO;

import cu.uci.cesim.hce_back.Entity.User;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface IUserDao extends CrudRepository<User, Long> {

    List<User> findAll();


}
