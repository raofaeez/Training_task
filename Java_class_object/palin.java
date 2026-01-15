public class palin {
    public static void main(String[] args) {
        check t1=new check("namn");
        t1.display();
    }
    static  class check{
        String t;

        public check(String s) {
            t=s;
        }
        boolean isPalin(){
            String rev="";
            for(int i=t.length()-1;i>=0;i--){
                rev+=t.charAt(i);
            }
            return rev.equalsIgnoreCase(t);
        }
        void display(){
            if(isPalin()){
                System.out.println("palindrome");
            }else{
                System.out.println("not palindrome");
            }
        }

        
    }
}
