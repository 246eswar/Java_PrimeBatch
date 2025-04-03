package Throw;
class EvenOrOddExcepation extends Exception{
	EvenOrOddExcepation(String msg){
		super(msg);
	}
}
public class EvenOdd {
	static void evenOrOdd(int num) throws EvenOrOddExcepation{
		if(num%2!=0) {
			throw new EvenOrOddExcepation("even number please");
		}
	}
	public static void main(String[] args)  throws EvenOrOddExcepation{
			try {
				evenOrOdd(7);
			}catch(EvenOrOddExcepation e) {
				System.out.println(e);
			}
	}

}
