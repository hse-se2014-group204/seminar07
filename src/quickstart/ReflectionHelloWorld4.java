package quickstart;

/**
 * Created by Алена on 14.10.2014.
 */

// Get constructor and create instance

import java.lang.reflect.Constructor;

public class ReflectionHelloWorld4 {
    public static void main(String[] args){
        //create instance of "Class"
        Class<?> c = null;
        try{
            c=Class.forName("quickstart.Foo4");
        }catch(Exception e){
            e.printStackTrace();
        }

        //create instance of "Foo"
        Foo4 f1 = null;
        Foo4 f2 = null;

        //get all constructors
        Constructor<?> cons[] = c.getConstructors();

        try {
            f1 = (Foo4) cons[0].newInstance();
            f2 = (Foo4) cons[1].newInstance("abc");
        } catch (Exception e) {
            e.printStackTrace();
        }

        f1.print();
        f2.print();
    }
}

class Foo4 {
    String s;

    public Foo4(){}

    public Foo4(String s){
        this.s=s;
    }

    public void print() {
        System.out.println(s);
    }
}
