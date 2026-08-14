
class Mobile {
    static String brand;
    String name;
    int price;


    void display() {
        System.out.println(brand + name + price);
    }

}
public class StaticKeyword {
    public static void main(stringImplementation[] args){

        Mobile m1= new Mobile();
        m1.brand="apple";
        m1.name="17pro";
        m1.price=1700;

        Mobile m2= new Mobile();
        m2.brand="samsung";
        m2.name="M17E";
        m2.price=1500;

        m1.brand="syz";
        m1.display();
        m2.display();
    }


}
