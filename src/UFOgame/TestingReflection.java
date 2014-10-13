package UFOgame;

/**
 * Created by Алена on 14.10.2014.
 */
// The Java Reflection API is used to manipulate classes
// and everything in a class including fields, methods,
// constructors, private data, etc.

// Because using the Reflection API is most often Dynamic
// it can slow down a program because the JVM can't
// optimize the code.

// The Reflection API can't be used with applets because
// of the added security applets require.

// Because this API allows you to do things like access
// private fields, methods, etc. it should be used
// sparingly, or else potentially destroy the logic
// of a program



import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class TestingReflection {

    public static void main(String[] args){

        // TODO: get the class Object for UFOEnemyShip
        // Everything in Java has a Class Object

        // TODO: get the class name of an Object

        // TODO: check modifiers of a class
        // They can be isPublic, isAbstract, isFinal, isInterface, isPrivate, isProtected,
        // isStatic, isStrict, isSynchronized, isVolatile

        // TODO: get a list of interfaces used by a class

        // TODO: get the super class for UFOEnemyShip

        // TODO: get the super class for Object and Class

        // TODO: get public methods names, are they getters or setters, return type and parameter type


        // TODO: access the constructers (default and with params)

        try {

           // TODO: make a new EnemyShipFactory with default constructer, use new Class[]...

            // TODO: make new instance with params 12,  "Random String"

        }
        // TODO: specify witch exceptions can you catch
        catch (Exception e){
            e.printStackTrace();
        }

        // TODO: return the parameters for a UFOEnemyShip constructor

        try {

            // TODO: create an UFOEnemyShip object by calling newInstance
        }
        // TODO: specify witch exceptions can you catch
        catch (Exception e) {
            e.printStackTrace();
        }

        // TODO: call methods in the UFOEnemyShip Object
        // TODO: set Name to the newEnemyShip = "Xt-1000"
        // TODO: get this Name and print it


        // Accessing private fields using reflection

        // Field stores info on a single field of a class

        Field privateStringName = null;

        try {

            // TODO: create new UFOEnemyShip


            // TODO: define the private field you want to access
            // You can access any field with just its name dynamically

            // Hot tips: shut down security to allow you to access private fields


            // TODO: get the value of a field and store it in a String


            // TODO: get access to a private method

            // TODO: get the return value from the method





            // FINALLY!!! Executing a method that has parameters

            // TODO: define the parameters expected by the private method
            // TODO: provide the parameters with values


            // TODO: get the method by providing its name and a Class array with parameters


            // TODO: execute the method and pass parameter values. The return value should be stored stored
        }

        // TODO: specify witch exceptions can you catch
        catch (Exception e) {
            e.printStackTrace();
        }

    }

}
