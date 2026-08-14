

class Test
{
    static String url;

    static {
        url="https://localhost:3000";
        System.out.println("frontend_configured_successfully");
    }
}

// java also allow--  Static nested Class
class Outer
{
    static class Inner
    {
        void show()
        {
            System.out.println("hello");
        }
    }
}


public class Static2 {
public static void main(String[] args)
{
    Outer.Inner Obj=new Outer.Inner();
    Obj.show();
}
}


//First: normal overriding
//
//Suppose we have:
//
//class Parent {
//
//    void show() {
//        System.out.println("Parent");
//    }
//}
//
//class Child extends Parent {
//
//    @Override
//    void show() {
//        System.out.println("Child");
//    }
//}
//


//Now:
//
//Parent obj = new Child();
//
//obj.show();
//
//Output:
//
//Child
//Why?
//
//Although the reference is:
//
//Parent obj
//
//the actual object is:
//
//        new Child()
//
//Java looks at the actual object at runtime.
//
//Parent obj = new Child();
//     ↑             ↑
//reference       actual object
//        Child
//
//obj.show()
//   ↓
//           Child.show()
//
//This is method overriding.
//
//Now add static
//
//Change the methods:
//
//class Parent {
//
//    static void show() {
//        System.out.println("Parent");
//    }
//}
//
//class Child extends Parent {
//
//    static void show() {
//        System.out.println("Child");
//    }
//}
//
//Now:
//
//Parent obj = new Child();
//
//obj.show();
//
//Output:
//
//Parent
//
//This is where it gets confusing.
//
//Why didn't Java call Child.show()?
//
//Because show() is static.
//
//Static methods belong to the class, not the object.
//
//So Java looks at the reference/class type, not the actual object.