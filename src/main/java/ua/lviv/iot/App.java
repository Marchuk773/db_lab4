package ua.lviv.iot;

import java.sql.SQLException;
import ua.lviv.iot.model.entity.Exercise;
import ua.lviv.iot.model.entity.Person;
import ua.lviv.iot.service.ExerciseService;
import ua.lviv.iot.service.PersonService;
import ua.lviv.iot.view.View;

public class App {
    public static void main(String[] args) throws SQLException {
        // new View().show();

        System.out.println(new PersonService().findAll());
        System.out.println(new PersonService().findByInitials("John", "Doe"));
        System.out.println(new PersonService().find(2));
        System.out
                .println(new PersonService().update(new Person(20, "Yura", "Kalush", "Male", 24)));
        System.out.println(new PersonService().find(20));
        System.out.println(new ExerciseService().find(1));
        // System.out.println(new ExerciseService()
        // .create(new Exercise(11, "Super Exercise", 1.5, "torso", 20, 120)));
        System.out.println(new ExerciseService().find(12));

    }
}
