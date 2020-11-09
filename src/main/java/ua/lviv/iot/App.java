package ua.lviv.iot;

import java.sql.SQLException;
import ua.lviv.iot.view.View;

public class App {
    public static void main(String[] args) throws SQLException {
        new View().show();
    }
}
