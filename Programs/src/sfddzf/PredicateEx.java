package sfddzf;
/*import java.util.*;
import java.util.function.Predicate;
public class PredicateEx {
	public static void main(String[] args) {
		//ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(1,2,3,4,5));
		Predicate<Integer> p=(Integer i)->(i%2==0);
		boolean r=p.test(10);
		System.out.println(r);

	}
}
*/
import java.util.*;
import java.util.function.BiPredicate;
public class PredicateEx {
	public static void main(String[] args) {
		BiPredicate<Integer,Integer> p=(Integer i,Integer j)->((i+j)%2==0);
		boolean r=p.test(1,1);
		System.out.println(r);
		
	}
}