package set;
import java.util.Iterator;
import java.util.TreeSet;


public class set5 {

	public static void main(String[] args) {
		TreeSet<Integer> t=new TreeSet<Integer>();
		TreeSet<Integer> th=new TreeSet<Integer>();
		t.add(1);
		t.add(2);
		t.add(3);
		t.add(45);
		t.add(4);
		t.add(8);
		th=(TreeSet)t.headSet(7);
		Iterator<Integer> i = th.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next() + " ");
		}

		// TODO Auto-generated method stub

	}

}
