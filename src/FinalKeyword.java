

//final
// ├── final variable  → cannot be reassigned
// ├── final method    → cannot be overridden
// └── final class     → cannot be inherited


// naming convention
// Java developers usually write constants in: UPPERCASE_WITH_UNDERSCORES


//However, final parameters aren't used everywhere in modern Java code; they're mainly useful when you specifically want to prevent reassignment.
class Tests
{
    static final double pi=3.142768;
}

class test2{
//    final int rollno=99;
        final int rollno;  //
        test2(int rollno)
        {
            this.rollno=rollno;
        }
    String name;
}

// final with methods
//        if we use final keyowrd with method that are restrict to overirde the method

// why we use final keyword with method
// Suppose you have a security-related operation: like banking,balance,transaction realed method then we wanted the defination or logic is not completely changed by anyone who iherit our property or through overriding
class Vehicle
{
   final void start()
    {
        System.out.println("vehicle is start buuuu...");
    }
}
class Car extends Vehicle
{
  //  void start()    it is not override because final restrict to override
    {
        System.out.println("car is starting");
    }
}


// final class
// final class restrict to inherit properties

final class X
{
    void show()
    {
        System.out.println("x is here");
    }
}
//class Y extends X  // it give error becoz A final class cannot be inherited.
//{
//
//}

public class FinalKeyword {
    public static void main(String[] args)
    {
        final int  age=22;
//        age=24; it's not been re-assigned because it's a final varible
    X x =new X();
    x.show();

//      static with final keyword

        // if we want to access static varible so we did not need to create obj
        System.out.println(Tests.pi);




        final test2 tt=new test2(22);  // final reference variable , final protect ss
//        tt.rollno=242;
        test2 tt1=new test2(44);
        test2 tt4 =new test2(444);

        System.out.println(tt.rollno+ " "+tt1.rollno+" "+tt4.rollno);


//        . Why is this useful?
//        Suppose every student has a unique ID.

        class Student {
            final int studentId;
            Student(int studentId) {
                this.studentId = studentId;
            }
        }

//        Once the student is created:
    Student s = new Student(101);
//        you don't want:
//        s.studentId = 999;

//        So:
//        final
//        protects that field from reassignment.




    }
}
