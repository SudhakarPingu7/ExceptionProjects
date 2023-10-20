package ArrayList;

import java.util.ArrayList;

public class PrintString {
	public static void main(String[] args) {
		ArrayList<String> name =new ArrayList<>();
		name.add("sudhakar");
		name.add("mani");
		name.add("virat");
		System.out.println(name);
		System.out.println(name.size());
		System.out.println(name.get(0));
	    name.set(0, "vali");
	    System.out.println(name);
	    name.remove(0);
	    System.out.println(name);
	    for(int i=0;i<name.size();i++) {
	    	System.out.println(name.get(i));
	    }
	}

} 
