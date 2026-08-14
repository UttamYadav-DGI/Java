package collection;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListDemo {
    public  static void main(String[] args)
    {
        Collection<Integer> nums=new ArrayList();

        nums.add(6);
        nums.add(8);
        nums.add(4);
        nums.add(1);

        System.out.println(nums);

        //for printing value one by one
        for(int n:nums) System.out.println(n);
    }
}
