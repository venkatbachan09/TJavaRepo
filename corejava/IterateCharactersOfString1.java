package corejava;

public class IterateCharactersOfString1 {

    public static void main(String[] args) {

        // 1. test String
        String str = "BenchResources.Net";
        System.out.println("Original String :- \n" + str);


        // 2. iterate using Java 8 Stream
        System.out.println("\nIterating over Characters of String :- ");
        str
                .chars()
                .forEach(ch -> System.out.print((char)ch + " "));
    }
}