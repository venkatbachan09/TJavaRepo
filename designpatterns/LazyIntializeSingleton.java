package designpatterns;

public class LazyIntializeSingleton {

    private static LazyIntializeSingleton lazyIntializeSingleton = null;
    /*
    for singleton design pattern we need a private constructor ok
    so that no one can call with new operator and create object of this class

    and it one method will  create object of this singleton but we need to make lazy so
     */
    private LazyIntializeSingleton(){

    }

public static LazyIntializeSingleton  getInstance(){
        if(lazyIntializeSingleton!=null){
            lazyIntializeSingleton = new LazyIntializeSingleton();
        }
        return lazyIntializeSingleton;// but how we can this methos without creating object, method make as a static
    // but here also whenever we call this static method with class name , it will create new object so for avoiding will check object already created or not
    // for that we need a private variable, so we got static varible trying to used in static context so make variable as static
}
// well this approach is good but when two threads come at time it will be creating two objects so we need to go with eager intialization by jvm
}
