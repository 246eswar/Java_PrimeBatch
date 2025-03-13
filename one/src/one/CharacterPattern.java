/*package one;
import java.util.*;

public class CharacterPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);//Z
		for (int i=1;i<=2;i++) {
			for (int j=1;j<=13;j++) {
				System.out.print((char)(ch--)+" ");
			}
			System.out.println();
		}
	}

}*/

//UpperCase to LowerCase
/*package one;
import java.util.*;
public class CharacterPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);//A//65
		System.out.println((char)(ch+32));
	}
}
*/
//lowercase to uppercase
package one;
import java.util.*;
public class CharacterPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);//a//97
		System.out.println((char)(ch-32));
	}
}