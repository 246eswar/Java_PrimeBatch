package Collection;
import java.util.*;
public class SetCollection {
	public static void main(String[] args) {
		Set<Integer> s=new HashSet<Integer>();
		s.add(10);
		s.add(20);
		System.out.println(s.size());
		System.out.println(s.contains(0));
		System.out.println(s.remove(20));
		System.out.println(s);
		System.out.println(s.isEmpty());
	}
}