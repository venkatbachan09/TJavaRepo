package corejava;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test {
    /*
    write code how to get employee details and print in sorted order of employee name from  employee hashmap .
    Here Employee class is having multiple fields like id, name and salary. Hashmap key is employee id and value is employee Object.


Sample code :

class Employee
{
private int id;
private String name;
private double salary;
}

Employee e1 = new Employee(101, "CHETAN", 3000);

Hashmap<Integer, Employee> hm  = new Hashmap<Integer, Employee>();

hm.put(101, e1);
hm.put(102, e2);


Result :

105, "AMAR", 2000
103  "BHASKAR", 1500
101, "CHETAN", 3000
     */
    public static void main(String[] args) {
        Map<Integer, Employee> unSorted = new HashMap<>();
        Employee e1= new Employee(101, "AMAR", 3000);
        unSorted.put(e1.getId(), e1);
        Employee e2= new Employee(105, "BHASKAR", 1500);
        unSorted.put(e2.getId(), e2);

        Employee e3= new Employee(103, "CHETAN", 5000);
        unSorted.put(e3.getId(), e3);
        for(Map.Entry<Integer, Employee> itr: unSorted.entrySet()){
            System.out.print(itr.getKey());
            System.out.print(" | ");
            System.out.print(itr.getValue().getId());
            System.out.print(" | ");
            System.out.print(itr.getValue().getName());
            System.out.print(" | ");
            System.out.print(itr.getValue().getSalary());
            System.out.print(" | ");
            System.out.println();
            System.out.println(" ------- EnD --------------------- ");
            System.out.println("     ");
        }
        TreeMap<Integer, Employee> sortedMap = new TreeMap<>(Collections.reverseOrder());
        sortedMap.putAll(unSorted);
        for(Map.Entry<Integer, Employee> itr: sortedMap.entrySet()){
            System.out.print(itr.getKey());
            System.out.print(" | ");
            System.out.print(itr.getValue().getId());
            System.out.print(" | ");
            System.out.print(itr.getValue().getName());
            System.out.print(" | ");
            System.out.print(itr.getValue().getSalary());
            System.out.print(" | ");
            System.out.println();
            System.out.println("-------------------------------------");
        }
    }
    }

