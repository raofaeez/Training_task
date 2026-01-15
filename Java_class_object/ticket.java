public class ticket {
    public static void main(String[] args) {
        movie m1=new movie("toxic", 121, 599);
        m1.book(12, 599);
        m1.display();
    }
}
class movie{
    String mov;
    int seat;
    int price;

    public movie(String m,int s,int p) {
        mov=m;
    }
    void book(int s,int p){
        seat=s;
        price=p;
        System.out.println("seat booked successfullyyyyy!");
    }
    void display(){
        System.out.println("movie name:- "+ mov);
        System.out.println("seat number "+ seat);
        System.out.println("price of ticket "+ price);
    }
    
}
