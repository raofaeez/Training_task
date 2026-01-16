class Employee {


    public int empID;
    protected String dep;
    private double salary;

    Employee(int id, String dept, double sal) {
        empID = id;
        dep = dept;
        salary = sal;
    }


    public void setSalary(double sal) {
        salary = sal;
    }


    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {

    String level;

    Manager(int id, String dept, double sal, String level) {
        super(id, dept, sal);
        this.level = level;
    }

    void displayDetails() {
        System.out.println("Employee ID: " + empID);  
        System.out.println("dep: " + dep);    
        System.out.println("Salary: " + getSalary());   
        System.out.println("Level: " + level);
    }
}

public class EmployeeMain {
    public static void main(String[] args) {

        Manager m = new Manager(101, "IT", 75000, "Senior");

        m.displayDetails();
        m.setSalary(85000);

        System.out.println("Updated Salary: " + m.getSalary());
    }
}
