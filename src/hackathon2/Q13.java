package hackathon2;

import java.util.LinkedList;
public class Q13 {
  public static void main (String[] args) {
	        
	        
	        LinkedList<String> list = new LinkedList<String>();
	  
	        
	        list.add("AAA");
	        list.add("BBB");
	        list.add("CCC");
	        list.add("2020");
	        list.add("2021");
	  
	       
	        System.out.println("LinkedList:\t" + list);
	  
	        System.out.println("The last element is removed:\t" + list.removeLast());
	          
	        
	        System.out.println("Final LinkedList:\t" + list);
	          
	        
	        System.out.println("The first element is removed:\t" + list.removeFirst());
	  
	       
	        System.out.println("Final LinkedList:\t" + list);
	    }
	}

