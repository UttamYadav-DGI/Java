

class Calulators
{
    int num; // it is a instance variable
    public int add(int n1,int n2,int n3)
    {
        return n1+n2+n3;
    }

    public int add(int n1,int n2){
        return n1+n2;
    }
    public  double add(int n1,float n2)
    {
        return n1+n2;
    }
}



public class MethodOverloading {

    public static void main(stringImplementation[] args){
        Calulators cal= new Calulators();
        System.out.println(cal.add(3,4,5));
        cal.add(3,4);
        cal.add(5,4.0f);
    }
}
