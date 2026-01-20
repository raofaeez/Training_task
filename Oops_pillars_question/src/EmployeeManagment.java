import java.util.ArrayList;
import java.util.List;

interface department{
    void assign(String departmentName);
    String getDepart();
}
abstract  class Employee implements department{
    private int id;
    private String name;
    protected double sal;
    private String depart;

    public Employee(int i,String n,double s){
        id=i;
        name=n;
        sal=s;
    }
    public abstract double calculate();
    public   void display(){
        System.out.println("id:- "+id);
        System.out.println("name:- "+ name);
        System.out.println("salary:- "+calculate());
        System.out.println("department:- "+depart);
    }

    public void assign(String d){
        depart=d;
    }
    public String getDepart(){
        return depart;
    }
    public int getId(){
        return id;
    }
    public void setId(int d){
        id=d;
    }
    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
}
class fullTimeEmployee  extends Employee{
    fullTimeEmployee(int i,String name,double salary){
        super(i,name,salary);
    }
    public double calculate(){
        return  sal;
    }
}
class partTimeEmployee extends Employee{
    private int hr;
    private int hrRate;
    public partTimeEmployee(int empId,String name,double salary,int h,int rate){
        super(empId,name,salary);
        hr=h;
        hrRate=rate;
    }
    public double calculate(){
        return hr*hrRate;
    }
}
public class EmployeeManagment {
    static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        Employee emp1 = new fullTimeEmployee(101, "Alice", 50000);
        Employee emp2 = new partTimeEmployee(102, "Bob", 120, 300,400);

        emp1.assign("HR");
        emp2.assign("IT");

        employees.add(emp1);
        employees.add(emp2);

        // Polymorphism: Employee reference
        for (Employee emp : employees) {
            emp.display();
        }
    }
}
