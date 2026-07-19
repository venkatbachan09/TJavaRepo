package corejava;

import java.util.*;
import java.util.stream.Collectors;

public class StringMain {
    public static void findRepeatString(){
        String name = "THATHA";

    }
    public static void main(String[] args) {
        String name = "THATHA";
       StringMain.findRepeatString();
        System.out.println(name.charAt(0));
        System.out.println(name.getBytes());
        name.chars().forEach(e->{
            System.out.println(e);
        });

        //imperative approch first repeate string
        Set<String> frs = new HashSet<>();
        List<String> data = Arrays.asList(name.split(""));
        for(String itr: data){
            System.out.println(itr);
            if(!frs.contains(itr)){
                frs.add(itr);
            }else {
                System.out.println(itr +" here");
                break;
            }
        }
        //declaraive approach
        frs.clear();
        Arrays.stream(name.split("")).collect(Collectors.toList()).forEach(e->{
            if(!frs.contains(e)){
                frs.add(e);
            }else{
                System.out.println(e + " here 2");
                //break;
            }
        });
        //String res = Arrays.stream(name.split("")).collect(Collectors.toList()).stream().filter(e->!frs.add(e)).findFirst();
        Set<Integer> fri = new HashSet<>();
        OptionalInt res = name.chars().filter(i->!fri.add(i)).findFirst();
        if(res.isPresent()){
            System.out.println("here 3");
            System.out.println((char)res.getAsInt());
        }

    }

}
