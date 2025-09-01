package Project;

public class box {
	double width;
	double height;
	double depth;
	
	void volume() {
		System.out.println("Volume is " + width * height * depth);
	}

	public static void main(String[] args) {
		box mybox1 = new box();
		box mybox2 = new box();
		
		mybox1.width = 10;
		mybox1.height = 70;
		mybox1.depth = 30;
		
		
		mybox2.width = 20;
		mybox2.height = 50;
		mybox2.depth = 40;
		
		mybox1.volume();
		mybox2.volume();
	}


}
