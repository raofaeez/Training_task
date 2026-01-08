import java.util.Scanner;

public class uniChar {
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

    public static char[] uni(String s) {
        int len = find(s);

        char[] temp = new char[len]; 
        int ucnt = 0;

        for (int i = 0; i < len; i++) {
            char curr = s.charAt(i);
            boolean is = true;

            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == curr) {
                    is = false;
                    break;
                }
            }
            if (is) {
                temp[ucnt++] = curr;
            }
        }
        char[] res = new char[ucnt];
        for (int i = 0; i < ucnt; i++) {
            res[i] = temp[i];
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String text = sc.nextLine();
        char[] ans = uni(text);
        for (char ch : ans) {
            System.out.print(ch + " ");
        }

        sc.close();
    }
}
