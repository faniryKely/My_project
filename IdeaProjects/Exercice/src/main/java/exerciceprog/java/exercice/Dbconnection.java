package exerciceprog.java.exercice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbconnection {
    private String url;
    private String username;
    private String password;


    public Dbconnection(){
        this.url = PostgresqlConf.URL;
        this.username = PostgresqlConf.USER;
        this.password = PostgresqlConf.PASSWORD;
    }

    public  Connection CreateConnection () {
        try {
            Connection connection = DriverManager.getConnection(
                    this.url, this.username, this.password
            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

}
