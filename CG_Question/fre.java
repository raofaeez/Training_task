import java.util.Scanner;

public class fre {
    public static void main(String[] args) {
         Scanner scn=new Scanner(System.in);
        String s=scn.nextLine();

        int[]fre=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!=' '){

                fre[ch-'a']++;
            }
        }
        for(int i=0;i<26;i++){
            System.out.print((char)(i+'a')+"-"+ fre[i]+" ");
        }
    }
}
