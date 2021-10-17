package UdacityProject.collectionExample;

import java.util.LinkedList;
import java.util.List;

public class CollectionExercise {
    public static void main(String[] args) {

        List<String> listItems = new LinkedList<String>();
        listItems.add("Mike");
        listItems.add("Bob");
        listItems.add("Alice");

        for (int i = 0; i < listItems.size(); i++) {
            System.out.println("list of items" + i);

        }
    }
}
