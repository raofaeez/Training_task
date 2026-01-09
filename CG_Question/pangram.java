import java.util.Scanner;

public class pangram {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String s=scn.nextLine();

        int[]fre=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            fre[ch-'a']++;
        }
        for(int i=0;i<26;i++){
            if(fre[i]==0){
                System.out.println("not pangram");
            }
        }
    }
}
