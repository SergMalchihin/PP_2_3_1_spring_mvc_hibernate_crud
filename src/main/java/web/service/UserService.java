package web.service;

import web.model.User;

import javax.validation.Valid;
import java.util.List;

public interface UserService {

    List <User> getAllUsers(); // запрос select
    User getUserById (long id);
    void addUser(User user);//запрос update
    void delete(long id); //запрос delete
    void updateUser (long id, User updateUser);

}
