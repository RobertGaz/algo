package my.yoy;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Kek {
    public static void main(String[] args) {
        int[] arr = new int[] {1,4,23,90,11};
        IntStream stream = Arrays.stream(arr);
        stream.forEach(elem -> System.out.println(elem));
        stream.sorted();
        stream.boxed();

        Integer[] arr2 = new Integer[] {1, 4, 599, 22};
        Stream<Integer> stream2 = Arrays.stream(arr2);
        stream2.sorted();
        stream2.forEach(elem -> System.out.println(elem));

    }
}
