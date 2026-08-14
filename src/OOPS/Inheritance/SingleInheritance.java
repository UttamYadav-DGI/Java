package OOPS.Inheritance;

class Vehicle
{
    String colour;
    double price;
    int    gear;
    boolean sunRoof;

    Vehicle(String colour,double price,int gear,boolean sunRoof)
    {
        this.colour=colour;
        this.price=price;
        this.gear=gear;
        this.sunRoof=sunRoof;
    }

    void musicSystem()
    {
        System.out.println("sony with bigBass");
    }

}
class Mercedez extends Vehicle
{
    Mercedez(String colour,double price, int gear,boolean sunRoof){
    super(colour,price,gear,sunRoof);
    }
}
public class SingleInheritance {
    public static void main(String[] args)
    {
        Mercedez m=new Mercedez("black",20000,6,true);
        System.out.println(m.colour+ " "+ m.price+" "+m.gear+" "+m.sunRoof);
    }
}
