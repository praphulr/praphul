package Arithemetic;

import java.util.Iterator;
import java.util.LinkedList;


public class assign2 {
	

	public static void main(String[] args) {
		LinkedList<Integer> l=new LinkedList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		Iterator i= l.iterator();
		while(i.hasNext())
			System.out.println(i.next());
			
		// TODO Auto-generated method stub

	}

}
