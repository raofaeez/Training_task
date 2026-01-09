
import java.util.Scanner;

public class anagram {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String s=scn.nextLine();
        String s1=scn.nextLine();
        int[]fre=new int[26];
        int[]fre1=new int[26];
        for(char ch:s.toCharArray()){
            fre[ch-'a']++;
        }
        for(char ch:s1.toCharArray()){
            fre1[ch-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(fre[i]!=fre1[i]){
                System.out.println("not anagram");
            }
        }
        System.out.println("anagram");
    }
}
