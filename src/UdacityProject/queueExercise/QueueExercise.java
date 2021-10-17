package UdacityProject.queueExercise;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExercise {
    public static void main(String[] args) {

        Queue<String> myQueue = new LinkedList<>();

        myQueue.add("1234");
        myQueue.add("2345");
        myQueue.add("1234");
        myQueue.add("3456");
        myQueue.add("4567");

        while(!myQueue.isEmpty()){
            System.out.println("Customer "
                    + myQueue.poll() + " is getting helped");
        }
    }
}
