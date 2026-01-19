class Book{
    String title;
    int publicationYear;
    Book(String t,int y){
        title=t;
        publicationYear=y;
    }
    void displayInfo(){
        System.out.println(title+" "+publicationYear);
    }
}
class Author extends Book{
    String name;
    String bio;
    Author(String t,int y,String n,String b){
        super(t,y);
        name=n;
        bio=b;
    }
    void displayInfo(){
        System.out.println(title+" "+publicationYear+" "+name+" "+bio);
    }
}
public class Library{
    public static void main(String[]args){
        Author a=new Author("Java",2020,"John","Writer");
        a.displayInfo();
    }
}
