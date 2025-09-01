package Project;
import java.util.Scanner;
class calculator{
	int add (int a, int b) {
		return a + b ;
	}
	int sub (int a, int b) {
		return a - b ;
	}
}

public class calcu_class {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter first number: ");
		int a = sc.nextInt();
		System.out.println("Enter second number: ");
		int b = sc.nextInt();
		calculator calc = new calculator();
		int result = calc.add(a, b);
		System.out.print("Result of " + a + " and " + b + " is : " + result);
		sc.close();
	}

}
