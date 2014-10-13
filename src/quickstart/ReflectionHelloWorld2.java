package quickstart;

/**
 * Created by Алена on 14.10.2014.
 */

// Invoke method on unknown object

import java.lang.reflect.Method;

public class ReflectionHelloWorld2 {
    public static void main(String[] args){
        Foo2 f = new Foo2();

        Method method;
        try {
            method = f.getClass().getMethod("print", new Class<?>[0]);
            method.invoke(f);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Foo2 {
    public void print() {
        System.out.println("abc");
    }
}
