package UdacityProject.setExample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExercise {
    public static void main(String[] args) {

        List<String> numbers = new ArrayList<>();

        numbers.add(0, "1234");
        numbers.add(0, "4321");
        numbers.add(0, "2314");
        numbers.add(0, "1234");
        numbers.add(0, "1234");
        numbers.add(0, "1234");
        numbers.add(0, "6054");

        Set<String> uniqueNumbers = new HashSet<>(numbers);

        for (String unique: uniqueNumbers) {
            System.out.println(unique);
        }

    }
}
