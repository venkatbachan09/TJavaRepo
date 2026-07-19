package corejava;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Set<Integer> remDup = new HashSet<>();
        //[1,2,3,4,5,6,7,6,3,2,4,1]

        remDup.add(1);
        remDup.add(2);
        remDup.add(3);
        remDup.add(4);
        remDup.add(5);
        remDup.add(6);
        remDup.add(7);
        remDup.add(6);
        remDup.add(3);
        remDup.add(2);
        remDup.add(4);
        remDup.add(1);
        remDup.forEach(e-> System.out.println(e));

        //


    }
}
