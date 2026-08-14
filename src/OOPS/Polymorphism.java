package OOPS;

// overloading( compile-time poymorphism)  same methodname but different signature
class Calulate
{
    public int add(int p1,int p2)
    {
        return p1+p2;
    }

    public double add(int x,int y,int z){
        return x+y+z;
    }

}
public class Polymorphism {
    public static void main() {
        Calulate c1=new Calulate();
        int a1=c1.add(2,2);
        double a2=c1.add(1,2,3);

        System.out.println("addition1 is "+a1+ "  addtiotn2 "+a2);
    }



}
