package quickstart;

/**
 * Created by Алена on 14.10.2014.
 */

// Create object from Class instance

public class ReflectionHelloWorld3 {
    public static void main(String[] args){
        //create instance of "Class"
        Class<?> c = null;
        try{
            c=Class.forName("quickstart.Foo3");
        }catch(Exception e){
            e.printStackTrace();
        }

        //create instance of "Foo"
        Foo3 f = null;

        try {
            f = (Foo3) c.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        f.print();
    }
}

class Foo3 {
    public void print() {
        System.out.println("abc");
    }
}
