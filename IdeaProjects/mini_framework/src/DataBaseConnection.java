import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
    private String url;
    private String username;
    private String password;

    public DataBaseConnection() {
        this.url = psqlCOnf.URL;
        this.username = psqlCOnf.USER;
        this.password = psqlCOnf.PASSWORD;
    }

    public  Connection createConnection(){
        try {
            Connection connection = DriverManager.getConnection(
                    this.url,this.username,this.password
            );
            return connection;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
