package cie_1;

class Salary {
    String name;
    int id;
    double salary;

    Salary(int roll, String n, double sal) {
       // this. = id;
       // this.name = name;
       // this.salary = salary;
    	name = n;
    	id = roll;
    	salary = sal;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

public class Employee {
    public static void main(String[] args) {

        Salary s1 = new Salary(1, "Riyan", 55000);
        Salary s2 = new Salary(2, "Eyan", 70000);
        Salary s3 = new Salary(3, "Ayan", 30000);
        Salary s4 = new Salary(4, "Aman", 2000);

        Salary[] employees = {s1, s2, s3, s4};

        System.out.println("Employees earning more than 50000:");
        for (Salary s : employees) {
            if (s.salary > 50000) {
                s.display();
            }
        }
    }
}
