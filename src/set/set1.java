package set;
import java.util.Iterator;
import java.util.TreeSet;


public class set1 {

	public static void main(String[] args) {
		TreeSet<String> t=new TreeSet<String>();
		t.add("red");
		t.add("green");
		t.add("blue");
		Iterator<String> i=t.iterator();
		while(i.hasNext());
		{
			System.out.print(i.next() +" ");
		}
		
		// TODO Auto-generated method stub

	}

}
