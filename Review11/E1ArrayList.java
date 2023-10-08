package Review11;

import java.util.ArrayList;

public class E1ArrayList {
    public static void main(String[] args) {
        int [] numbers = new int[10];  //traditional way of writing array.
        ArrayList<Integer> nums=new ArrayList<>(); //generics is good to be flexible to use different data types for Array (in the diamond brackets you can change the datatype.
        nums.add(10);
        nums.add(15);
        nums.add(45);
        nums.add(50);
        System.out.println(nums); //no need to write a loop.
        nums.remove(new Integer(45));  //removes based on value not based on index.
        System.out.println(nums);

    }
}
