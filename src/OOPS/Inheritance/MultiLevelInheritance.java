package OOPS.Inheritance;

class A
{
    void A()
    {
        System.out.println("a is calling");
    }
}

class B extends A
{
    void B()
    {
        System.out.println("B is calling");
    }
}

class C extends B
{
    void C()
    {
        System.out.println("C is calling");
    }
}

public class MultiLevelInheritance {

    public static void main(String[] args)
    {
        C c =new C();
        c.C();
        c.B();
        c.A();
    }
}

