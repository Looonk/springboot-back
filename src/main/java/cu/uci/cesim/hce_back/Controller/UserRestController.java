package cu.uci.cesim.hce_back.Controller;

import cu.uci.cesim.hce_back.Entity.User;
import cu.uci.cesim.hce_back.HISConnector.SendAndReceiveMessage_Imp;
import cu.uci.cesim.hce_back.Services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.keygen.KeyGenerators;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.persistence.PrePersist;
import java.util.Base64;
import java.util.Date;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = {"http://locahost:4200/"})
@RestController
public class UserRestController {

    @Autowired
    private IUserService service;

    @SuppressWarnings("unused")
    private Date createAt;

    @Autowired
    private SendAndReceiveMessage_Imp hl7App;

    @PrePersist
    public void prePersist() {
        createAt = new Date();
    }

    @RequestMapping("/users")
    @ResponseBody
    public List<User> users() {
        return (List<User>) service.findAll();
    }

    @RequestMapping("/users/{id}")
    @ResponseBody
    public User view(@PathVariable Long id) {
        return service.findById(id);
    }

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public User create(@RequestBody User user) {

        if (service.findByEmail(user.getEmail()) != null) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, "User already exist on database");
        }
        if (service.findByUsername(user.getUsername()) != null) {
            throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE, "Username already exist on database");
        }

        user.setCreateAt(new Date());
        String encodedString = Base64.getEncoder().encodeToString(user.getPassword().getBytes());
        user.setPassword(encodedString);
        return service.save(user);
    }

    @PutMapping("/users/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public User update(@RequestBody User user, @PathVariable Long id) {

        User actual = service.findById(id);
        actual.setNombre(user.getNombre());
        actual.setApellido(user.getApellido());
        actual.setEmail(user.getEmail());
        actual.setRoles(user.getRoles());
        return service.save(actual);
    }

    @DeleteMapping("/users/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.ACCEPTED)
    public User login(@RequestBody Map<String, String> data) {
        User user;
        String bdp;

        try {
            user = service.findByEmail(data.get("email"));
            bdp = user.getPassword();
        } catch (ResponseStatusException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User not Found");
        }

        try {
            String lp = Base64.getEncoder().encodeToString(data.get("password").getBytes());
            if (bdp.equals(lp)) {
                if (user.getToken() == null) {
                    user.setToken(KeyGenerators.string().generateKey());
                    service.save(user);
                    return user;
                } else {
                    return user;
                }
            } else {
                throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE, "Wrong Password");
            }

        } catch (ResponseStatusException e) {
            throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE, "Wrong Password");
        }
    }

    @RequestMapping(value = "/hl7", method = RequestMethod.POST)
    public String hl7(@org.jetbrains.annotations.NotNull @RequestBody String app) {


        if(hl7App != null && hl7App.isConfigured()){

            if(!hl7App.serverInRunning(app)){
                try {
                    hl7App.startServerIn(app);
                    return "App Started";
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                    throw new RuntimeException(e);
                } catch (Exception e1) {
                    System.out.println(e1.getMessage());
                    throw new RuntimeException(e1);
                }
            }

            else
                return "NO App";
        } else
            return "NOOOOOO";
    }
}
