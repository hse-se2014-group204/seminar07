package quickstart;

/**
 * Created by Алена on 14.10.2014.
 */

// Get class name from object

public class ReflectionHelloWorld {
    public static void main(String[] args){
        Foo f = new Foo();
        System.out.println(f.getClass().getName());
    }
}

class Foo {
    public void print() {
        System.out.println("abc");
    }
}
