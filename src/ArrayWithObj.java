

class Student{
    int rollNo;
    String name;
    int marks;
}

public class ArrayWithObj {

    public static void main(stringImplementation[] args) {

        Student s1 = new Student();
        s1.rollNo = 01;
        s1.name = "ram";
        s1.marks=56;

        Student s2=new Student();
        s2.rollNo=02;
        s2.name="shyam";
        s2.marks=90;

        Student s3=new Student();
        s3.rollNo=03;
        s3.name="radheshyam";
        s3.marks=97;

        Student students[]= new Student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;
//
//        for(int i=0;i<students.length;i++){
//            System.out.println(students[i].name + ":"+students[i].marks);
//        }

        //for ihnace loop
        for( Student stud:students){
            System.out.println(stud.name+" : "+ stud.marks);
        }

    }
}
