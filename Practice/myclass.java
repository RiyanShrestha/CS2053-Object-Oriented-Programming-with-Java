package Project; 
import java.util.Scanner;
public class myclass {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a sentence: ");
		String sentence = sc.nextLine();
		
		System.out.print("You entered :" + sentence);
		
		sc.close();
	}

}
