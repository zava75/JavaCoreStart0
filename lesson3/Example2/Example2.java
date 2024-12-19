package lesson3.Example2;

import lesson.User;

public class Example2<T> {

    private T instance;
    private int count = 0;
    private Example2() {}

    public static <T> void simpleInit (T instance) {

    }

    public static <T> Example2<T> init(User ruslan) {
        return new Example2<T>();
    }

    public void set(T object) {
        instance = object;
    }
    public T get() {
        return instance;
    }
    public T getInstance(){
        count += 1;
        System.out.println("count " + count);
        return instance;
    }

}
