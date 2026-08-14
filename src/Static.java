

class Students {
    int rollNo;
    String name="uttam";
    static String collegeName = "Dronacharya group of institutions, Greater Noida";

    static void DressCode() // in Static method we have access or use only static instance variable
    { // static method cannot directly access non-static variables
        System.out.println("for Boys: white shirt and black paints with blazzer");
        System.out.println("for girls: white suit and black daman");
    }


    // . How can static access non-static data?
// create an object inside the static method
    static void known() {
        Students obj=new Students();
        System.out.println("student name is "+obj.name);
    }

}
public class Static {
    public static void main(String[] args)
    {
        Students s1=new Students();
        Students s2=new Students();
        Students s3=new Students();

        Students.collegeName="IiTT";
        Students.DressCode();
        s1.rollNo=81;
        s1.name="uttan";

        s2.rollNo=64;
        s2.name="aman";

        s3.rollNo=43;
        s3.name="rajesh";

        System.out.println(s1.name+" "+Students.collegeName);

        Students.known();
    }
}


