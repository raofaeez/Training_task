import java.util.Scanner;

public class freNested {
     public static String[] find(String s) {
        char[] ch = s.toCharArray();
        int[] fre = new int[ch.length];
        for (int i = 0; i < ch.length; i++) {
            fre[i] = 1;
        }

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '0') {
                continue;
            }
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    fre[i]++;
                    ch[j] = '0';
                }
            }
        }
        int cnt = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != '0') {
                cnt++;
            }
        }
        String[] res = new String[cnt];
        int index = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != '0') {
                res[index++] = ch[i] + " : " + fre[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();

        String[] fre = find(s);

        System.out.println("char fre:");
        for (String st : fre) {
            System.out.println(st);
        }

    }
}
