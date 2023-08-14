import Model.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class userService {

    public static List<User> getUsers() {
        List<User> allUsers = new ArrayList<>();
        DataBaseConnection db = new DataBaseConnection();
        Connection connection = db.createConnection();
        try {
            String sql = "SELECT * FROM user";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while(resultSet.next()){
                User user = new User(
                        1,
"jujuju",
"trtrt"
//                        resultSet.getInt("id"),
//                        resultSet.getString("name"),
//                        resultSet.getString("first_name")
                );
                allUsers.add(user);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return allUsers;
    }
}
