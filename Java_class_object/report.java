
public class report {
    public static void main(String[] args) {
        card student1 = new card("Rao Faeez", 12, 420);
        student1.detail();
    }
}

class card{
    String name;
    int roll;
    int marks;

    public card(String n,int r,int m) {
        name=n;
        roll=r;
        marks=m;
    }
    String calculateGrade(){
        if(marks>=480){
           return "A+";
        }else if(marks>=410){
           return "A";
        }else if(marks>=350){
           return "B+";
        }else if(marks>=300){
           return "B";
        }else if(marks>=250){
           return "C";
        }else{
           return "FAIL!";
        }
    }
    void detail(){
        System.out.println(name);
        System.out.println(roll);
        System.out.println(calculateGrade());
    }
}
