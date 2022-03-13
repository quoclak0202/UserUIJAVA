package dao;

import model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import view.ListUserFrame;

public class UserDAO {

    public List<User> getAllUsers() throws SQLException {
        List<User> users = new ArrayList<User>();

        Connection connection = JDBCConnection.getJDBCConnection();

        String sql = "SELECT * FROM User_Account";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                User user = new User();

                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name_"));
                user.setPhone(rs.getString("phone_"));
                user.setUsername(rs.getString("userName_"));
                user.setPassword(rs.getString("passWord_"));
                user.setRole(rs.getString("role_"));
                user.setEmail(rs.getString("email"));

                users.add(user);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return users;
    }
    
    public User getUserById(int id) throws SQLException {
        
        Connection connection = JDBCConnection.getJDBCConnection();

        String sql = "SELECT * FROM User_Account WHERE ID = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                User user = new User();

                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name_"));
                user.setPhone(rs.getString("phone_"));
                user.setUsername(rs.getString("userName_"));
                user.setPassword(rs.getString("passWord_"));
                user.setRole(rs.getString("role_"));
                user.setEmail(rs.getString("email"));

                return user;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return null;
    }
    
    public void addUser(User user) throws SQLException {

        Connection connection = JDBCConnection.getJDBCConnection();

        String sql = "INSERT INTO User_Account (name_,phone_,email,userName_,passWord_,role_)  VALUES(?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getPhone());
            preparedStatement.setString(3, user.getEmail());
            preparedStatement.setString(4, user.getUsername());
            preparedStatement.setString(5, user.getPassword());
            preparedStatement.setString(6, user.getRole());
            
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
    
    public void updateUser(User user) throws SQLException {

        Connection connection = JDBCConnection.getJDBCConnection();

        String sql = "UPDATE users SET NAME = ?,PHONE = ?,USERNAME = ?,PASSWORD = ?,ABOUT = ?,FAVOURITES = ?,ROLE = ? WHERE ID = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getPhone());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getUsername());
            preparedStatement.setString(4, user.getPassword());
            preparedStatement.setString(5, user.getRole());

            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void deleteUser(int id) throws SQLException {

        Connection connection = JDBCConnection.getJDBCConnection();

        String sql = "DELETE FROM users WHERE ID = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);

            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
    public boolean getUserByUserNameandPassWord(String Username,String Password) throws SQLException {
        
        Connection connection = JDBCConnection.getJDBCConnection();

        String query = "select * from User_Account "
                + "Where userName_ = ? and passWord_ = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, Username);
            preparedStatement.setString(2, Password);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                 return true;
            }
            else{
                   return false;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return false;
    }
    public boolean getUserByUserName(String Username) throws SQLException {
        
        Connection connection = JDBCConnection.getJDBCConnection();

        String query = "select * from User_Account "
                + "Where userName_ = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, Username);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                 return true;
            }
            else{
                   return false;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return false;
    }
}
