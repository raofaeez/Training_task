import java.util.Scanner;

public class trim {
     public static int[] find(String s) {
        int st = 0;
        int e = s.length() - 1;
        while (st<=e && s.charAt(st)==' ') {
            st++;
        }
        while (e>=st && s.charAt(e)==' ') {
            e--;
        }
        return new int[]{st, e};
    }
    public static String create(String s, int st, int e) {
        String ans = "";

        for (int i =st;i<=e;i++) {
            ans=ans+s.charAt(i);
        }
        return ans;
    }
    public static boolean compare(String s1, String s2) {
        if (s1.length()!=s2.length()) {
            return false;
        }
        for (int i=0;i<s1.length();i++) {
            if (s1.charAt(i)!=s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String s=scn.nextLine();
        int[] idx=find(s);
        String manTrim =create(s, idx[0], idx[1]);
        String buildTrim =s.trim();
        boolean isSame =compare(manTrim, buildTrim);

        System.out.println("Trimmed using charAt(): [" + manTrim + "]");
        System.out.println("Trimmed using trim():  [" + buildTrim + "]");
        System.out.println("Are both strings equal? " + isSame);

       
    }
}
