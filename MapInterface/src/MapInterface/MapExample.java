package MapInterface;
import java.util.*;
public class MapExample {
	public static void main(String[] args) {
		HashMap<String,Integer> a=new HashMap<String,Integer>();
		a.put("a", 10);
		a.put("b", 20);
		a.put("c", 30);
		a.put("d", 40);
		a.put("e", 50);
		a.put("f", 60);
		System.out.println(a);
		System.out.println(a.get("a"));
		System.out.println(a.remove("f"));
		System.out.println(a);
		for(String key:a.keySet()) System.out.print(key+ " ");
		System.out.println();
		for(int value:a.values()) System.out.print(value+" ");
		System.out.println();
		System.out.println(a.size());
		Set<String> ks=new HashSet<String>(a.keySet());
		System.out.println(ks);
		System.out.println(a.containsKey("d"));
		System.out.println(a.clone());
		HashMap<String,Integer> b=new HashMap<String,Integer>();
		b.putAll(a);
		System.out.println(b);
	}
}