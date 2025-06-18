package sfddzf;
import java.util.function.Consumer;
import java.util.*;
public class Data 
{
	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(1,2,3,4,5));
		Consumer<ArrayList<Integer>> c=(ArrayList<Integer> ar)->{System.out.println(ar.get(0)+ar.get(1));};
		c.accept(arr);
		arr.forEach(i->System.out.println(i));
		}
	}



