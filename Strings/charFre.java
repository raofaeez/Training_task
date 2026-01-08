import java.util.Scanner;

public class charFre {
     public static String[][] find(String s) {
        int[] fre = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            fre[ch]++;
        }
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (fre[s.charAt(i)] > 0) {
                cnt++;
                fre[s.charAt(i)] = -fre[s.charAt(i)]; 
            }
        }
        fre = new int[256];
        for (int i = 0; i < s.length(); i++) {
            fre[s.charAt(i)]++;
        }
        String[][] result = new String[cnt][2];
        int index = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (fre[ch] > 0) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(fre[ch]);
                index++;
                fre[ch] = 0;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[][] fre = find(s);
        System.out.println("char fre");
        for (int i = 0; i < fre.length; i++) {
            System.out.println(fre[i][0] + "\t\t" + fre[i][1]);
        }

     
    }
}
