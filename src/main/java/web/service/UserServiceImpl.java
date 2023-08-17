package web.service;

import org.springframework.stereotype.Service;
import web.model.User;
import web.repository.UsersRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;


@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UsersRepository usersRepository;

    public UserServiceImpl(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Override
    public List<User> findAll() {
        return usersRepository.findAll();
    }

    @Override
    public User findOne(Long id) {
        Optional<User> foundPerson = usersRepository.findById(Math.toIntExact(id));
        return foundPerson.orElse(null);
    }

    @Transactional
    @Override
    public void save(User user) {
        usersRepository.save(user);
    }

    @Transactional
    @Override
    public void update(int id, User updatedUser) {
        updatedUser.setId(id);
        usersRepository.save(updatedUser);
    }

    @Transactional
    @Override
    public void delete(Long id) {
        usersRepository.deleteById(Math.toIntExact(id));
    }
}
