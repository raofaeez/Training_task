import java.util.Scanner;

public class volAndConst {
     public static String check(char ch) {

        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || 
                ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }

        return "Not a Letter";
    }
    public static int[] find(String text) {
        int vol = 0;
        int con = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch=text.charAt(i);
            String res=check(ch);

            if (res.equals("Vowel")) {
                vol++;
            } else if (res.equals("Consonant")) {
                con++;
            }
        }

        return new int[]{vol, con};
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String text = scn.nextLine();
        int[] ans = find(text);

        System.out.println("vol cnt : " + ans[0]);
        System.out.println("con cnt : " + ans[1]);
    }
}
