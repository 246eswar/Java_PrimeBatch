package MapInterface;
import java.util.*;
public class MapLinkedTree {
	public static void main(String[] args) {
		HashMap<String,Integer> a=new HashMap<String,Integer>();
		a.put("a", 10);
		a.put("b", 20);
		a.put("c", 30);
		a.put("d", 40);
		a.put("e", 50);
		a.put("f", 60);
		//iterator
		//Iterator<String,Integer> itr=new iterator();
		System.out.println(a);
		//entrySet
		//Map.Entry<String,Integer> b=Map.entry<String,Integer>();
		for(Map.Entry<String,Integer> me:a.entrySet()) {
			System.out.println(me+" ");			
		}
		for(Map.Entry<String,Integer> me:a.entrySet()) {
			System.out.println(me.getKey()+" ");			
		}
		for(Map.Entry<String,Integer> me:a.entrySet()) {
			System.out.println(me.getValue()+" ");			
		}
		for(Map.Entry<String,Integer> me:a.entrySet()) {
			System.out.println(me.getKey()+" "+me.getValue());			
		}
	}
}