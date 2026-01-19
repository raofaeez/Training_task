class Person{
    String name;
    int age;
    Person(String n,int a){
        name=n;
        age=a;
    }
    Person(){}
    void displayRole(){
     //   System.out.println("person");
    }
}
class Teacher extends Person{
    String subject;
    Teacher(String n,int a,String s){
       // super(n,a);
       name=n;
       age=a;
        subject=s;
    }
    @Override
    void displayRole(){
        System.out.println("Teacher");
    }
}
class Student extends Person{
    String grade;
    Student(String n,int a,String g){
        super(n,a);
        grade=g;
    }
    void displayRole(){
        System.out.println("Student");
    }
}
class Staff extends Person{
    String department;
    Staff(String n,int a,String d){
        super(n,a);
        department=d;
    }
    void displayRole(){
        System.out.println("Staff");
    }
}
public class School{
    public static void main(String[]args){
        Person p=new Teacher("A",30,"Math");
        p.displayRole();
    }
}
