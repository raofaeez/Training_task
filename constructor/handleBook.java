public class handleBook {
        static class bookdetail{
        String title;
        String author;
        double price;

        public bookdetail(String a,String b,double pr) {
            title=a;
            author=b;
            price=pr;
        }
        public void display(){
            System.out.println(title);
            System.out.println(author);
            System.out.println(price);
        }
        
     }
    public static void main(String[] args) {
        bookdetail b1=new bookdetail("capgemini", "Rao Faeez", 5999);
        b1.display();
    }
}
