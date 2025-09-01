package Project;
class Student{
	String name;
	int age;
	
	Student(String n, int a){
		name = n;
		age = a;
	}
	
	void display() {
		System.out.println("Name :" + name );
		System.out.println("Age:" + age );
	}
}

public class construct {
	public static void main(String[] args) {
		Student s1 = new Student("Riyan", 20);
		Student s2 = new Student("Aryan", 18);
		
		s1.display();
		s2.display();
	}

}
