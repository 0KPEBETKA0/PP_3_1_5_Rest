package danil.shrimp.Rest.service;


import danil.shrimp.Rest.model.User;

import java.util.List;

public interface UsersService {

    List<User> getAllUsers();

    void saveUser(User user);

    User getUserById(Long id);

    User getUserByUsername(String username);

    void updateUser(Long id, User user);

    void removeUserById(Long id);
}
