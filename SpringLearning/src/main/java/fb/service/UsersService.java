package fb.service;


import java.util.List;

import fb.entity.User;

public interface UsersService {

    public void addNewUser(String name, String secondname, String login, String password, String mail, String phone);

    public void editUser(int id,String name, String secondname, String login, String password, String mail, String phone);

    public void deleteUser(int id);

    public User findById(int id);

    public List<User> findAllUsers();

}
