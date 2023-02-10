package solid.dependencyInversion.example.good;

import solid.dependencyInversion.example.bad.UserReader;
import solid.dependencyInversion.example.bad.XMLReader;

public class MyApp {
    public static void read(Reader reader) {

        UserReader userReader = new UserReader(reader);

        userReader.getUsername();

    }
}
