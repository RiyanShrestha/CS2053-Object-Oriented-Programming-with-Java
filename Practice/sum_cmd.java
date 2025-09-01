package Project;

public class sum_cmd {
	public static void main(String[] args) {
		if (args.length < 2) {
			System.out.println("Provide 2 num.");
		} else {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int sum = a + b;
			System.out.println("Sum of " + a + " and " + b + " is: " + sum);
		}
	}

}
