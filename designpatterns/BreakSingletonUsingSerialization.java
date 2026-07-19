package designpatterns;

import java.io.*;

public class BreakSingletonUsingSerialization {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        breakSingleton();
    }

    private static void breakSingleton() throws IOException, ClassNotFoundException {
        MultiThreadedIntializeSingleton multiThreadedIntializeSingleton = MultiThreadedIntializeSingleton.getInstance();

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("object.obj")); // creating shell here to write
        objectOutputStream.writeObject(multiThreadedIntializeSingleton);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("object.obj"));
        MultiThreadedIntializeSingleton multiThreadedIntializeSingleton1 = (MultiThreadedIntializeSingleton) objectInputStream.readObject();
        objectInputStream.close();

        System.out.println(multiThreadedIntializeSingleton.hashCode());
        System.out.println(multiThreadedIntializeSingleton1.hashCode());

        //calling enum
        EnumSingleton.INSTANE.doSomething();



    }
}
