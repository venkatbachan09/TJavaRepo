package corejava;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class TestCore {
    public static void main(String[] args) {
        //TestCore.removeElementFromArray();
        //TestCore.removeDuplicateFromString();
        //TestCore.removeDuplicateFromString2();
        //TestCore.removeElementFromArray1();
        //TestCore.removeElementFromArray2();
        //TestCore.reverseString();
        //TestCore.reverseStringWithoutstingBuilder();
        //TestCore.palidrome();
        TestCore.anagram();

    }

    private static void anagram() {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        char[] char1= str1.toCharArray();

        String str2 = sc.nextLine();
        char[] char2 = str2.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);

        if(Arrays.equals(char1,char2)){
            System.out.println("anagram");
        }else{
            System.out.println("not");
        }
    }

    private static void palidrome() {
        Scanner sc = new Scanner(System.in);
        String currentStr = sc.nextLine();
        String revStr = "";
        for(int i=currentStr.length()-1; i>=0; i--){
            revStr=revStr+currentStr.charAt(i);
        }
        System.out.println(currentStr);
        System.out.println(revStr);
        if(revStr.equals(currentStr)){
            System.out.println("palidrome");
        }else{
            System.out.println("not");
        }
    }

    private static void reverseStringWithoutstingBuilder() {
        String name = "Applications";

        String[] nameArray = name.split("");
        String[] reverseArray = new String[nameArray.length];
        int index = 0;
        for(int i=nameArray.length-1; i>=0; i--){
            reverseArray[index] = nameArray[i];
            index++;
        }
        System.out.println(Arrays.toString(reverseArray));

    }

    private static void reverseString() {
        String name = "javaagent";
        StringBuilder newString = new StringBuilder();
        Arrays.stream(name.chars().toArray()).forEach(e-> newString.append((char)(e)));
        System.out.println(newString.reverse());
    }

    private static void removeElementFromArray2() {
        int[] actualArray = {2, 4, 6, 7, 3, 6, 8, 4, 6, 9, 8};
        int toBeRemove = 8;
        //array convert to stream and filer and get new array and prin, that it
        System.out.println(Arrays.toString(Arrays.stream(actualArray).filter(e->e!=toBeRemove).toArray()));
    }

    private static void removeElementFromArray1() {
        int[] array= {4,5,3,6,6,2,5};
        int[] newArray = new int[array.length-1];
        int tobeRemove = 6;

        int[] newList = Arrays.stream(array).filter(e->e!=tobeRemove).toArray();

        System.out.println(Arrays.toString(newList));
    }

    private static void removeDuplicateFromString2() {
        String name = "Contents";
        Set<String> nonDup= new HashSet<>();
        StringBuilder nonDupStr = new StringBuilder();
        name.chars().forEach(e->{
            nonDup.add(String.valueOf((char)e));
        });
        nonDup.forEach(e->nonDupStr.append(e));
        System.out.println(nonDupStr);
    }

    private static void removeDuplicateFromString() {
        String name = "Contents";
        Set<String> nonDup = new HashSet<>();
        StringBuilder nonDupString = new StringBuilder();

       name.chars().forEach(e->{
           // System.out.println((char) e+"");
            nonDup.add(String.valueOf((char)e));
        });
        nonDup.forEach(e->{
            nonDupString.append(e);
        });
        System.out.println(nonDupString);
    }

    private static void removeElementFromArray() {
        //int[] elements = new int[]{1,2,4,5,6};
        int[] ele= {2,3,4,5,7};
        int toBeRemove = 7;
        // so we can not modify the exsting array so we need a new array which had length exacly less then one elment of current array
        int[] newOne = new int[ele.length-1];
        for(int i=0; i<ele.length; i++){
            if(ele[i]!=toBeRemove){
                newOne[i] = ele[i];
            }
        }
        for(int i=0; i<newOne.length; i++) {
            System.out.println(newOne[i]);
        }
        System.out.println(Arrays.toString(newOne));

    }
}
