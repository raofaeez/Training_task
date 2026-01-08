import java.util.Scanner;

public class palin {
    public static boolean is(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static boolean rec(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return rec(text, start + 1, end - 1);
    }

    public static char[] revString(String text) {
        char[] rev = new char[text.length()];
        int index = 0;
        for (int i = text.length() - 1; i >= 0; i--) {
            rev[index++] = text.charAt(i);
        }

        return rev;
    }

    public static boolean check(String s) {
        char[] org = s.toCharArray();
        char[] rev = revString(s);
        for (int i = 0; i < org.length; i++) {
            if (org[i] != rev[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Logic 1 (Iterative): " + is(s));
        System.out.println("Logic 2 (Recursive): " + rec(s, 0, s.length() - 1));
        System.out.println("Logic 3 (Array)    : " + check(s));
    }
}
