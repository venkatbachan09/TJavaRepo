package corejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 3, 20, 10, 1, 20, 89, 27, 30};
        List<Integer> numList = Arrays.stream(nums).boxed().toList();
        List<Integer> dupList = new ArrayList<>();
        List<Integer> nondupList = new ArrayList<>();
        numList.forEach(e->{
            if(!dupList.contains(e)){
                dupList.add(e);
            }else{
                nondupList.add(e);
            }
        });
        nondupList.forEach(System.out::println);




        /*List<Integer> integers = Arrays.stream(nums).boxed().toList();
        List<Integer> numString = integers.stream().filter(e->e.toString().startsWith("2")).collect(Collectors.toList());
        numString.forEach(System.out::println);*/





    }
}
