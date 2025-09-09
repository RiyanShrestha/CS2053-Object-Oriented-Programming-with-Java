package lab004;
class A {
	A() {
		System.out.println("Hello i am A.");
		
	}
}
class B extends A{
	B() {
		System.out.println("Hello i am B.");
	}
}
class C extends B{
	C() {
		System.out.println("Hello i am C.");
	}
}

public class extend {
	public static void main(String[] args) {
		C obj = new C();
		
	}

}
