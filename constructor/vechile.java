public class vechile {
    static class registration{
        String car;
        String type;
        static int fee=10000;

        public registration(String s,String t) {
            car=s;
            type=t;
        }
        void display(){
            System.out.println("car name:- "+ car);
            System.out.println("car type:- "+ type);
            System.out.println("registration fee:- "+ fee);
        }    
        static void update(int n){
            fee=n;
        }    
    }
    public static void main(String[] args) {
        registration r1=new registration("honda city", "sedan");
        r1.display();
        System.out.println();
        registration.update(30000);
        r1.display();
    }
}
