package ArrayList;

import java.util.ArrayList;

public class PrintNumber {
	public static void main(String[] args) {
		ArrayList<Integer> nums=new ArrayList<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		System.out.println(nums);
		for(Integer num:nums) {       //enhanced for loop is only forward (no reverse)
			System.out.println(num);
		}nums.forEach(x->System.out.println(x)); //forEach 
	
	}

}
