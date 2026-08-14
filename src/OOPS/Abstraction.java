package OOPS;

class Tea
{
    public void makeTea()
    {
         waterBoiling();
         addIngredient();
         waiting();
         completed();
    }

    private void waterBoiling()
    {
        System.out.println("water is boiling");
    }
    private void addIngredient()
    {
        System.out.println("addIngredients-milk,sugar,tea");
    }
    private void waiting()
    {
        System.out.println("waiting for tea colour");
    }
    private void completed()
    {
        System.out.println("tea is ready");
    }
}

public class Abstraction {
    public static void main(String[] args)
    {
        Tea t1=new Tea();
        t1.makeTea();
    }
}
