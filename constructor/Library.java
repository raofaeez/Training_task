public class Library {
    static class Book{
        public String ISBN;
        protected String title;
        private String author;

        public Book(String s,String t,String a) {
            ISBN=s;
            title=t;
            author=a;
        }
        public void setAuth(String s){
            author=s;
        }
        public String getAuth(){
            return author;
        }

        
    }
    static class Ebook extends Book{
        String format;

        public Ebook(String s,String t,String a,String f) {
            super(s, t, a);
            format=f;
        }
        void display(){
            System.out.println("ISBN:- "+ISBN);
            System.out.println("Title:- "+title);
            System.out.println("author:- "+getAuth());
            System.out.println("Format:- "+format);
        }
        
    }
    public static void main(String[] args) {
           Ebook e = new Ebook("987-123456789", "Effective Java", "Singla", "PDF");
        e.display();
        e.setAuth("rao");
        System.out.println("updated author:- "+ e.getAuth());
    }
}
