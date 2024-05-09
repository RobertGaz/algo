package my.yoy;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MyTest {

    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Arrays.asList(900, 2, 45, 0, 1, 66, 23));

//        queue.add(8);
//        queue.add(1);
//        queue.add(789);
//        queue.add(10);
//        System.out.println(queue.remove());
//        queue.add(6);
//        queue.add(6000);
//        queue.add(500);


        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
        System.out.println(queue);
    }

}
