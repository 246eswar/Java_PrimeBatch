package Throw;
import java.io.*;
public class Excep {
	    static void check() throws FileNotFoundException {
	        File fobj = new File("C:\\Users\\Admin\\Desktop\\new.txt");
	        if (!fobj.exists()) {
	            throw new FileNotFoundException("File is not available");
	        }
	        else System.out.println("Available");
	    }
	    public static void main(String[] args) {
	        try {
	            check();
	        } catch (FileNotFoundException e) {
	            System.out.println("Exception Raised!!");
	        }
	    }
}