package designpatterns;

public class EagerIntializeSingleton {

    private static EagerIntializeSingleton lazyIntializeSingleton = new EagerIntializeSingleton();
    /*
    for singleton design pattern we need a private constructor ok
    so that no one can call with new operator and create object of this class

    and it one method will  create object of this singleton but we need to make lazy so
     */
    private EagerIntializeSingleton(){

    }

public static EagerIntializeSingleton getInstance(){
        return lazyIntializeSingleton;// but how we can this methos without creating object, method make as a static
    // but here also whenever we call this static method with class name , it will create new object so for avoiding will check object already created or not
    // for that we need a private variable, so we got static varible trying to used in static context so make variable as static
}

// now here when classes loading time it self jvm will create one object and whenever get instance method calls only object will return
    // here we have a another problem is that, if this class not use also we are creating jvm and it will useless so for this problem we need to go with
    //multithreaded singleton class.

}
