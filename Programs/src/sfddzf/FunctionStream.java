package sfddzf;
import java.util.function.Function;
import java.util.*;
public class FunctionStream {
	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(1,2,3,4,5));
		Function<Integer,Integer> f=(i->i*2);
		System.out.println(f.apply(3));
	}
}
