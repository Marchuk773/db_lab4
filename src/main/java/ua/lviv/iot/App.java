package ua.lviv.iot;

import java.sql.SQLException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    public static void main(String[] args) throws SQLException {
        SpringApplication.run(App.class, args);
    }
}
