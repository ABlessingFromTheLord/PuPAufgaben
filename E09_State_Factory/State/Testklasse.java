package E09_State_Factory.State;

import java.io.IOException;

public class Testklasse {
    public static void main(String[] args) throws IOException {
        Haustier dog = new Haustier();
        dog.start();
    }
}
