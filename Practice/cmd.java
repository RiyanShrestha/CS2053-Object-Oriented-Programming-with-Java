package Project;

public class cmd {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("No sentence entered!");
		} else {
			String sentence = String.join(" ", args);
			System.out.println("You entered : " + sentence);
			for (String arg : args) {
				System.out.println(arg);
			}
		}
	}

}
