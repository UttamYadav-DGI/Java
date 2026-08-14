package OOPS.Inheritance;

class Vehicles
{
    int price;
    String brand;
    String Colour;
    int tiers;

    public Vehicles(int price, String brand, String colour, int tiers) {
        this.price = price;
        this.brand = brand;
        Colour = colour;
        this.tiers = tiers;
    }
    void start()
    {
        System.out.println("Vehicle start");
    }
}

class motorCycles extends Vehicles
{
    motorCycles(int price,String brand,String colour,int tiers)
    {
        super(price,brand,colour,tiers);
    }

    void twoWheelers()
    {
        System.out.println("two wheelers vehicles");
    }
}

class Car extends Vehicles
{
    Car(int price,String brand,String colour,int tiers)
    {
        super(price,brand,colour,tiers);
    }
    void fourWheeleers()
    {
        System.out.println("four wheelers vehicles");
    }
}
public class Hierarchical {
    public static void main(String[] args)
    {
        motorCycles bike=new motorCycles(300000,"RoyalEnfield","black",2);
        Car car = new Car(2000000,"Scorpio-N","black",4);

        // MotorCycle
        System.out.println(bike.brand);
        System.out.println(bike.price);
        System.out.println(bike.Colour);
        System.out.println(bike.tiers);

        bike.start();        // inherited from Vehicles
        bike.twoWheelers();  // MotorCycles method


        System.out.println("----------------");


        // Car
        System.out.println(car.brand);
        System.out.println(car.price);
        System.out.println(car.Colour);
        System.out.println(car.tiers);

        car.start();         // inherited from Vehicles
        car.fourWheeleers();  // Car method

    }
}
