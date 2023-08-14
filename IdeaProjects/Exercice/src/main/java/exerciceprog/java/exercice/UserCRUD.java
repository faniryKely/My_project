package exerciceprog.java.exercice;


import javax.swing.plaf.nimbus.State;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserCRUD {
    // TODO : insert a new user into the database
    public boolean insertUser(String name, String email, String password){
        DataBaseConnection db = new DataBaseConnection();
        Connection connection = db.createConnection();
        try{
            String sql = "INSERT INTO admin (name, email, password) VALUES (name = ? , email= ? , password=? )";
//            String sql = "INSERT INTO admin (name,email,password) VALUES ('faniry', 'qsdfqmsdf@gmail.com', 'qkfqmdg')";
            PreparedStatement statement = connection.prepareStatement(sql);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return true;
    }

    // Retrieve a single User using its ID
    public User findUserById(int id){
        DataBaseConnection db = new DataBaseConnection();
        Connection connection = db.createConnection();
        try{
            String sql = "SELECT * FROM admin WHERE id = " + id;
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            if(resultSet.next()){
                return new User(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("email"),
                        resultSet.getString("password")
                );
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    // TODO : get all users in the database


    public List<User> findAllUsers(String tableDataBAse){
        List<User> allUsers = new ArrayList<>();
        DataBaseConnection dataBase = new DataBaseConnection();
        Connection connection = dataBase.createConnection();

        try {
            String sql = "SELECT * FROM " +tableDataBAse;
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while(resultSet.next()) {
               User user = new User(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("email"),
                        resultSet.getString("password")
                );
                allUsers.add(user);

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return allUsers;
    }

    // TODO : delete a single user using its ID
    public boolean deleteUser(int id){
        DataBaseConnection mdb = new DataBaseConnection();
        Connection connection = mdb.createConnection();

        try {
            String sql = "DELETE  FROM admin WHERE id= " +id;
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return true;
    }

    // TODO : update a single user by using its id, and giving the new informations.
    public boolean updateUser(int id, String newName, String newEmail, String newPassword){
        return true;
    }

//    public static void main(String[] args) {
//        UserCRUD crud = new UserCRUD();
////        System.out.println(crud.insertUser("faniry", "faniryrandria08@gmail.com", "qskdjfqmfqm"));
//        System.out.println(crud.findAllUsers("admin"));
////        System.out.println(crud.deleteUser(3));
////        System.out.println(crud.insertUser("Tsilavina", "tsilavina@gmail.com", "sdfmlqkjsfdm"));
//    }
}
