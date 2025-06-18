package sfddzf;
import java.util.stream.Stream;
import java.util.*;
public class StreamEx {
	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(1,2,3,4,5));
		Stream<Integer> s=arr.stream();
		Stream<Integer> s1=s.filter(i->i%2==0);
		Stream<Integer> s2=s1.map(i->i*2);
		s2.forEach(j->System.out.println(j));
	}
}
