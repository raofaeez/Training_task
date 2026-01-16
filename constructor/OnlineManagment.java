public class OnlineManagment {
    static class course{
        String name;
        int duration;
        int fee;
        static String institue="cagemini labs";

        public course(String n,int d,int f) {
            name=n;
            duration=d;
            fee=f;
        }
        void display(){
            System.out.println("course name:- "+name);
            System.out.println("course duration:- "+duration);
            System.out.println("course fee:- "+fee);
            System.out.println("institute name:- "+institue);
        }
        static void update(String n){
            institue=n;
        }
        
     }
    public static void main(String[] args) {
        course c1=new course("btech", 4, 1200000);
        course c2=new course("java full stack", 1, 12000);
        c1.display();
        System.out.println();
        course.update("xyz");
        c1.display();
        System.out.println();
        c2.display();

    }
}
