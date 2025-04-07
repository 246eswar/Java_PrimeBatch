package Collection;
import java.util.*;
public class IteratorExample {
	public static void main(String[] args) {
		/*ArrayList<Integer> a =new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		Iterator<Integer> itr=a.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());			
		}*/
		Set<Integer> a=new LinkedHashSet<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		Iterator<Integer> itr=a.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());			
		}
	}
}