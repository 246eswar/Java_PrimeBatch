package sfddzf;
//import java.util.function.Consumer;
//import java.util.*;
/*public class ConsumerDemo {
	public static void main(String[] args)
	{
		Consumer<Integer> c=(Integer i)->{System.out.println("This is a consumer "+i);};
		c.accept(32);
	}
}
*/

//biconsumer
/*
import java.util.function.Consumer;
import java.util.function.BiConsumer;
import java.util.*;
public class ConsumerDemo {
	public static void main(String[] args)
	{		Consumer<Integer> c=(Integer i)->{System.out.println("This is a consumer "+i);};
		c.accept(32);
		c.accept(12);
		BiConsumer<Integer,Integer> bc=(Integer i,Integer j)->{System.out.println("This is a consumer "+i+" "+j);};
		bc.accept(32,6);
	}
}
*/


//interface ->private,static ,default
/*
interface Consu{
	static void msg()
	{
		System.out.println("This is a default method");
		mess();
	}
	private static void mess()
	{
		System.out.println("This is a private method");
	}
}
public class ConsumerDemo implements Consu{
	
	public static void main(String[] args) {
		ConsumerDemo c=new ConsumerDemo();
		Consu.msg();
	}
}
*/

//consumer
/*
  import java.util.function.Consumer;
import java.util.*;
public class ConsumerDemo {
	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(1,2,3,4,5));
		Consumer<ArrayList<Integer>> c=(ArrayList<Integer> ar)->{System.out.println(ar.get(0)+ar.get(1));};
		c.accept(arr);
		arr.forEach(i->System.out.println(i));
	}
}
*/
