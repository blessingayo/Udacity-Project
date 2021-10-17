package UdacityProject.exceptionExample;

import java.util.ArrayList;
import java.util.Collections;

public class SortingExample {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();

        names.add("Mummy");
        names.add("Lara");
        names.add("James");
        names.add("Patience");
        names.add("Daniel");

        Collections.sort(names);

        for (String name : names){
            System.out.println(name);

        }
    }
}
