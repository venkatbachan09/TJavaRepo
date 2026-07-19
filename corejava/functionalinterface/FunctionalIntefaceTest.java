package corejava.functionalinterface;

public class FunctionalIntefaceTest {
    public static void main(String[] args) {
        FunctionalInterface fun = (a, b) -> a + b;
        System.out.println(fun.add(1,2));
    }
}
