
import java.util.Scanner;
public class hell1 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n>0) {
			System.out.print("Positive");
		}
		else if(n<0) {
			System.out.println("Negative");
		}
		else {
			System.out.println("Zero");
		}
	}

}
