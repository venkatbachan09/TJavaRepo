/*
package corejava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class MethodRefEx {
    static void staticMethod(String s) {
        System.out.println("Static method: " + s);
    }

    void instanceMethod(String s) {
        System.out.println("Instance method: " + s);
    }
}

public class MethodReferenceExample1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Static Method Reference
        names.forEach(MethodRefEx::staticMethod);

        // Instance Method Reference of a Particular Object
        MethodRefEx obj = new MethodRefEx();
        names.forEach(obj::instanceMethod);

        // Instance Method Reference of an Arbitrary Object of a Particular Type
        names.forEach(MethodRefEx::new);

        // Constructor Reference
       // List<MethodRefEx> instances = names.stream()
         //       .map(MethodRefEx::new)
          //      .collect(Collectors.toList());
    }
}
*/
