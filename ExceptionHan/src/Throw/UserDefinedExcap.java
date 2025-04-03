package Throw;
//extents the exception
class NoNegativeException extends Exception{
	NoNegativeException(String msg){
		super( msg);
	}
}
public class UserDefinedExcap {
	public void exceptionCheck(int num) throws NoNegativeException {
		if(num<=0) {
			throw new NoNegativeException("please enter positive number");
		}
	}
	public static void main(String[] args) throws NoNegativeException {
		// TODO Auto-generated method stub
		UserDefinedExcap c=new UserDefinedExcap();
		try {
		c.exceptionCheck(0);
	}catch(NoNegativeException e) {
		System.out.println(e);
	}
		}
}