package Task3.Service;

import Task3.Classes.User;

public interface UserService {
    void register();
    User login();
    void getUserByEmail();
    void getAllUsers();
}
