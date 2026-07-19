package java8;

@FunctionalInterface
public interface MyFunctionalInterface{
    int addTwoNumber(int a, int b);

    default void display(){
        System.out.println("project allocated");
    }

    static void display2(){
        System.out.println("project allocated static");
    }

}