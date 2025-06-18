package sfddzf;
import java.util.*;
import java.util.stream.Stream;
public class Methodref {
	public static void main(String[] args)
	{
		ArrayList<String> a = new ArrayList<>(Arrays.asList("Rama","lakshman","sitha","hanuman"));
		Stream<String> s=a.stream();
		Stream<String> s1=s.map(String::toUpperCase);
		s1.forEach(i -> System.out.println(i));
	}
}
