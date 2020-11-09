package ua.lviv.iot.view;

import java.sql.SQLException;
import java.text.ParseException;

public interface Printable {

    void print() throws SQLException, ParseException;

}
