package com.testing.Controller;

import java.util.Base64;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.persistence.PrePersist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.encrypt.Encryptors;
import org.springframework.security.crypto.keygen.KeyGenerators;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.testing.Entity.User;
import com.testing.Services.IUserService;

@CrossOrigin(origins = { "http://locahost:4200/" })
@RestController
public class UserRestController {

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(16);

    @Autowired
    private IUserService service;

    @SuppressWarnings("unused")
    private Date createAt;

    @PrePersist
    public void prePersist() {
        createAt = new Date();
    }

    @RequestMapping("/users")
    @ResponseBody
    public List<User> users() {
        List<User> lista = (List<User>) service.findAll();
        return lista;
    }

    @RequestMapping("/users/{id}")
    @ResponseBody
    public User view(@PathVariable Long id) {
        return service.findById(id);
    }

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public User create(@RequestBody User user) {
        
        if(service.findByEmail(user.getEmail())!=null) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, "User already exist on database");
        }
        if(service.findByUsername(user.getUsername())!=null) {
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

}
