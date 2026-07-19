package corejava.java8;

import java.util.Arrays;
import java.util.List;

public class LambaEx {
    public static void main(String[] args) {
        // Example: Sorting a list of strings using lambda expression
        String[] arr = {"Alice", "Bob", "Charlie"};
        List<String> names = Arrays.asList();
        names.sort((a, b)->a.compareTo(b));

        //stream api
        int[] nums = {2, 4, 5, 6, 6 , 7, 7, 3};
        List<Integer> numList = Arrays.stream(nums).boxed().toList();
        System.out.println(numList.stream().max(Integer::compareTo));
    }



}
