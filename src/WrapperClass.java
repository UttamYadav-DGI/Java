// what is the wrapper class

//Java has primitive data types:
//byte
//short
//int
//long
//float
//double
//char
//boolean
//
//These are not objects.
//But Java also provides classes that wrap these primitive values inside objects. These are called Wrapper Classes.

// wrapper class of byte->Byte, int -> Integer, char-> Character

// why we use ?
// we have a primitice types but java collections work with object   ArrayList<Integer> list;


//Integer x= 10;
// x is a refrence , Integer is a integerObject, 10 value that are contains


// important 🥊
// AutoBoxing ---- >Java automatically converts a primitive into its corresponding wrapper object.
// Unboxing --> java automatically converts a wrapperObj into primitive type
public class WrapperClass {
    public static void main(String[] args)
    {
        int x=10;
        Integer y=x;
        System.out.println("y "+y);


        Integer z=10;
        int c=z;
        System.out.println("c is "+c);
    }



}

