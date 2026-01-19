class Employee{
String name;
int id;
double salary;
    Employee(String n,int i,double s){
        name=n;id=i;salary=s;
    }
    void displayDetails(){
        System.out.println(name+" "+id+" "+salary);
    }
}
class Manager extends Employee{
    int teamSize;
    Manager(String n,int i,double s,int t){
        super(n,i,s);
        teamSize=t;
    }
    void displayDetails(){
        System.out.println(name+" "+id+" "+salary+" "+teamSize);
    }
}
class Developer extends Employee{
String programmingLanguage;
    Developer(String n,int i,double s,String p){
        super(n,i,s);
        programmingLanguage=p;
    }
    void displayDetails(){
        System.out.println(name+" "+id+" "+salary+" "+programmingLanguage);
    }
}
class Intern extends Employee{
    int duration;
    Intern(String n,int i,double s,int d){
        super(n,i,s);
        duration=d;
    }
    void displayDetails(){
        System.out.println(name+" "+id+" "+salary+" "+duration);
    }
}
public class EmployeeIn{
    public static void main(String[]args){
        Employee[]e={new Manager("A",1,50000,5),new Developer("B",2,40000,"Java"),new Intern("C",3,15000,6)};
        for(Employee x:e)x.displayDetails();
    }
}
