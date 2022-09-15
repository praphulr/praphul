package set;
import java.util.HashSet;
import java.util.HashSet;

public class set7 {

	public static void main(String[] args) {
		HashSet<String> t= new HashSet<String>();
	
		t.add("p");
		t.add("b");
		t.add("a");
		t.add("r");
		t.add("l");
		System.out.println(t);
		HashSet<String> h= new HashSet<String>();
		h = (HashSet) t.clone();
		System.out.println(h);
		// TODO Auto-generated method stub

	}

}
