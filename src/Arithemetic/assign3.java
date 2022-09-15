package Arithemetic;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;


public class assign3 {

	public static void main(String[] args) {
		LinkedList<Integer> l=new LinkedList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		Collections.reverse(l);
		ListIterator i=l.listIterator();
		while(i.hasNext())
			System.out.println(i.next());

		Iterator<Integer> ia=l.descendingIterator();
		while(ia.hasNext())
			System.out.println(ia.next());
		
			
		
		// TODO Auto-generated method stub

	}

}
