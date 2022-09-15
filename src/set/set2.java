package set;
import java.util.TreeSet;
import java.util.TreeSet;

public class set2 {

	public static void main(String[] args) {
		TreeSet<String> t=new TreeSet<String>();
		t.add("red");
		t.add("green");
		t.add("blue");
		//Iterator<String> i= t.iterator();
		for(String c:t)
		{
			System.out.print(c +" ");
			
		}
		

	}

}
