import java.util.Scanner;

public class wordLen {
    public static String[] split(String s) {
        String temp = "";
        int cnt = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                cnt++;
            }
        }
        cnt++; 

        String[] words = new String[cnt];
        int index = 0;

        // Extract words
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                temp = temp + s.charAt(i);
            } else {
                words[index++] = temp;
                temp = "";
            }
        }
        words[index] = temp;

        return words;
    }

    public static int find(String s) {
        int cnt = 0;
        try {
            while (true) {
                s.charAt(cnt);
                cnt++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return cnt;
        }
    }
    public static String[][] creaye(String[] s) {
        String[][] ans = new String[s.length][2];

        for (int i = 0; i < s.length; i++) {
            int len = find(s[i]);
            ans[i][0] = s[i];
            ans[i][1] = String.valueOf(len);
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        String[] words = split(s);
        String[][] and = creaye(words);
        System.out.println("\nWord\t\tLength");

        for (int i = 0; i < and.length; i++) {
            int length = Integer.parseInt(and[i][1]);
            System.out.println(and[i][0] + "\t\t" + length);
        }

    }
}
