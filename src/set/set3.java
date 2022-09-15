package set;
import java.util.Iterator;
import java.util.TreeSet;


public class set3 {

	public static void main(String[] args) {
		TreeSet<String> t=new TreeSet<String>();
		t.add("1");
		t.add("2");
		t.add("3");
		t.add("4");
		t.add("5");
		Iterator<String> i=t.descendingIterator();
		while(i.hasNext())
		{
			System.out.print(i.next() +" ");
		}

		



		// TODO Auto-generated method stub

	}

}
