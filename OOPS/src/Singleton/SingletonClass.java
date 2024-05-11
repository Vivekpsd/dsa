package Singleton;

public class SingletonClass {
    private SingletonClass () {

    }

    private static SingletonClass SingletonObject;

    static public SingletonClass getInstance() {
        // check one object only created or not, if not created - create one
        if (SingletonObject == null) {
            SingletonObject = new SingletonClass();
        }
        return SingletonObject;
    }
}