package designpatterns;

import java.io.Serializable;

public class MultiThreadedIntializeSingleton implements Serializable {

    private static MultiThreadedIntializeSingleton multiThreadedIntializeSingleton = null;
    /*
    for singleton design pattern we need a private constructor ok
    so that no one can call with new operator and create object of this class

    and it one method will  create object of this singleton but we need to make lazy so
     */
    private MultiThreadedIntializeSingleton(){

    }

public static MultiThreadedIntializeSingleton getInstance(){
        if(multiThreadedIntializeSingleton==null){
            synchronized (MultiThreadedIntializeSingleton.class) {
                if(multiThreadedIntializeSingleton==null) { // why this double null check bcoz if two thread coming in this synchronized block
                    //if one thread create object, then second should not create again right, if have this null check it will check if it is not create only it will
                    // create.
                    multiThreadedIntializeSingleton = new MultiThreadedIntializeSingleton();
                }
            }
        }
        return multiThreadedIntializeSingleton;// but how we can this methos without creating object, method make as a static
    // but here also whenever we call this static method with class name , it will create new object so for avoiding will check object already created or not
    // for that we need a private variable, so we got static varible trying to used in static context so make variable as static
}
// this pattern is good but we can break this one as well
    // using serialization process if convert this object into byte stream we can break this single design lets see this

    protected Object readResolve(){
        return multiThreadedIntializeSingleton;
    }

    //now serialization issue resolve but we have another issue which is reflection api can get all the construtors and make private to public and break the '
    //singleton to solve this problem as well, we need to go with enum.
}
