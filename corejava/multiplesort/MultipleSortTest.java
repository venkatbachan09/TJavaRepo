package corejava.multiplesort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MultipleSortTest {
    public static void main(String[] args) {
        System.out.println("###### multiple sort here ######");
        List<Employee> notSortedList = new ArrayList<>();
        Employee e1 = new Employee();
        e1.setAge(23);
        Employee e2= new Employee();
        e2.setAge(30);

        Employee e3= new Employee();
        e3.setAge(11);

        notSortedList.add(e1); notSortedList.add(e2);notSortedList.add(e3);
        Collections.sort(notSortedList, new EmployeeAgeComparator()
                .thenComparing(new EmployeeIdComparator()));

        System.out.println(notSortedList);

    }
}
