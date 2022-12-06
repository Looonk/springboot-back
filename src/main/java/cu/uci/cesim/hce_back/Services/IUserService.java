package cu.uci.cesim.hce_back.Services;

import cu.uci.cesim.hce_back.Entity.User;
import java.util.List;

public interface IUserService {

    public List<User> findAll();

    public User save(User x);

    public void delete(Long id);

    public User findById(Long id);

    public User findByEmail(String email);

    public User findByUsername(String username);

}
