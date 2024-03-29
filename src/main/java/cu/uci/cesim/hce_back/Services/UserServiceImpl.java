package cu.uci.cesim.hce_back.Services;

import cu.uci.cesim.hce_back.DAO.IUserDao;
import cu.uci.cesim.hce_back.Entity.User;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userdao;

    @Override
    public List<User> findAll() {
        return (List<User>) userdao.findAll();
    }

    @Override
    public User save(User user) {
        return userdao.save(user);
    }

    @Override
    public void delete(Long id) {
        userdao.deleteById(id);

    }

    @Override
    public User findById(Long id) {
        return userdao.findById(id).get();
    }

    @Override
    public User findByEmail(String email) {
        List<User> users = userdao.findAll();
        for (User x : users) {
            if (x.getEmail().equals(email)) {
                return x;
            }
        }
        return null;
    }

    @Override
    public User findByUsername(String username) {
        List<User> users = userdao.findAll();
        for (User x : users) {
            if (x.getUsername().equals(username)) {
                return x;
            }

        }
        return null;
    }


}
