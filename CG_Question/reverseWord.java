import java.util.Scanner;
public class reverseWord {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        String[] words = s.split(" ");
        for(int i=0;i<=words.length-1;i++){
            StringBuilder sb = new StringBuilder(words[i]);
            sb.reverse();   
            System.out.print(sb.toString()+" ");
        }
    }
}
