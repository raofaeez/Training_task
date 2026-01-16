public class University {
    static class Students{
        public int roll;
        protected String name;
        private double cgpa;

        public Students(int r,String n,double c) {
            roll=r;
            name=n;
            cgpa=c;
        }
        public  double getcgpa(){
            return cgpa;
        }
        public void setcgpa(double c){
            cgpa=c;
        }
        
    }
    static class Post extends Students{
        String specialisation;

        public Post(int r,String n,double cg,String s) {
            super(r,n,cg);
            specialisation=s;
        }
        void display(){
            System.out.println("roll no:- "+ roll);
            System.out.println("name:- "+name);
            System.out.println("CGPA:- "+getcgpa());
            System.out.println("speciasation:- "+specialisation);
        }
        
    }
    public static void main(String[] args) {
        Post pg=new Post(2139, "rubez", 9.01, "full stack");
        pg.display();
        pg.setcgpa(8.33);
        System.out.println("after cgpa updation");
        pg.display();

    }
}
