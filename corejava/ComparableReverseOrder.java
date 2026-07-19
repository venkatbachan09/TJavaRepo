package corejava;

public class ComparableReverseOrder implements Comparable<ComparableReverseOrder>{
private int age;
    public int compareTo(ComparableReverseOrder o){
        //reverse order
        if(age < o.age){
            return 1;
        }else if(age > o.age){
            return -1;
        }
        return 0;
    }
}
