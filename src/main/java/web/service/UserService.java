package web.service;

import web.model.User;

import javax.validation.Valid;
import java.util.List;

public interface UserService {

    List<User> findAll();
    User findOne(Long id);
    void save(User user);
    void update(int id, User updatedUser);
    void delete(Long id);


}
