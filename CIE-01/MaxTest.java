package cie_1;

class MaxOverload {

    // Method to find maximum of two integers
	 public static int max(int a, int b) {
	        return (a > b) ? a : b; // ternary operator for max
	    }

	    // Overloaded method to find maximum of three integers
	    public static int max(int a, int b, int c) {
	        return max(max(a, b), c); // reuse two-parameter max
	    }
	}

public class MaxTest {
    public static void main(String[] args) {
        System.out.println("Max of (10, 20): " + MaxOverload.max(10, 20));
        System.out.println("Max of (10, 20, 5): " + MaxOverload.max(10, 20, 5));
    }
}
