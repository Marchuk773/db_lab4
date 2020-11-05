package ua.lviv.iot;

import java.sql.SQLException;

import ua.lviv.iot.service.PersonService;
import ua.lviv.iot.view.View;

public class App {
    public static void main(String[] args) {
        // new View().show();

        try {
            System.out.println(new PersonService().findAll());
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
