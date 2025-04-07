package Collection;
import java.util.*;
//hasNext();
//next();
//previous();
//previousNext();
//listInterface
//ArrayList
//iterator
//list interface ArrayList class (<> are called Generic)
//List<String> list=new ArrayList<String>();
//List<Integer> list=new ArrayList<Integer>();
//List<Book> list=new ArrayList<Book>();
//List<String> list=new LinkedList<String>();
public class CollectionExample {
	public static void main(String[] args) {
		List<Integer> arr=new ArrayList<Integer>();
		arr.add(10);
		arr.add(20);
		System.out.println(arr.size());
		System.out.println(arr.get(0));
		
	}
}