package Throw;
import java.util.*;
//35 to 100 qualified
//else not qualified
//exception handling use and if not qualified give exception raise
class NotQualifiedException extends Exception{
	NotQualifiedException(String message) {
        super(message);
    }
}
public class QizeExam {
	static void checkMarks(int marks) throws NotQualifiedException{
		if(marks<35||marks>100) {
			throw new NotQualifiedException("He/She is not qualified");
		}
		System.out.println("He/She is Qualified");
	}	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {	
			int num=sc.nextInt();
		checkMarks(num);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}