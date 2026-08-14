// what is interface ?
// interface is a contract. it tells a class what must do it. while class decide how to do it


//An interface is a special Java type used to define a contract that classes can implement.
//example:
//interface Animal {
//
//    void sound();
//}
//Here:
//void sound();  doesn't contain implementation.
//
//It basically says: "Any class that implements Animal must provide a sound() method."
//
//Then:
//
//class Dog implements Animal {
//
//    @Override
//    public void sound() {
//        System.out.println("Dog barks");
//    }
//}
//

// why do we need interface
//magine you're building a payment system.
//
//You have:
//
//Payment
//│
//        ├── CreditCard
//├── UPI
//├── PayPal
//└── NetBanking
//
//Every payment method should have:
//
//pay()
//
//But the implementation differs.
//
//Credit Card:
//
//pay()
// ↓
//Credit card API
//
//UPI:
//
//pay()
// ↓
//UPI API
//
//PayPal:
//
//pay()
// ↓
//PayPal API
//
//An interface allows you to define the common contract:
//
//interface Payment {
//
//    void pay(double amount);
//}
//
//Then:
//
//class CreditCard implements Payment {
//
//    @Override
//    public void pay(double amount) {
//        System.out.println("Paid using Credit Card: " + amount);
//    }
//}
//class UPI implements Payment {
//
//    @Override
//    public void pay(double amount) {
//        System.out.println("Paid using UPI: " + amount);
//    }
//}
//
//
//

public class Interface {

}
