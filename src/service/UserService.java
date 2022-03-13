package service;

import dao.UserDAO;
import java.sql.SQLException;
import java.util.List;
import model.User;

public class UserService {
    private UserDAO userDao;
    
    public UserService() {
        userDao = new UserDAO();
    }
    
    public List<User> getAllUsers() throws SQLException {
        return userDao.getAllUsers();
    }
    
    public void addUser(User user) throws SQLException {
        userDao.addUser(user);
    }
    
    public void deleteUser(int id) throws SQLException {
        userDao.deleteUser(id);
    }
    
    public User getUserById(int id) throws SQLException {
        return userDao.getUserById(id);
    }
    
    public void updateUser(User user) throws SQLException {
        userDao.updateUser(user);
    }
    public boolean checkUser(String username) throws SQLException{
        return userDao.getUserByUserName(username);
    }
    public boolean checkUser(String username,String password) throws SQLException{
        return userDao.getUserByUserNameandPassWord(username, password);
    }
}
