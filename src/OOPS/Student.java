package OOPS;

class Students
{
 String name;
 int rollno;
 int marks;

 Students(String name,int rollno,int marks)
 {
     this.name=name;
     this.rollno=rollno;
     this.marks=marks;
 }
}
public class Student {

    public static void main(String[] args)
    {
        Students s1=new Students("anmol",13,99);

        System.out.println("name "+s1.name+" rollno "+s1.rollno+" marks "+s1.marks);
    }

}
