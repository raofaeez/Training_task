
import java.util.Scanner;

public class compareCharAt {
    public static char[] get(String s) {
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }
        return arr;
    }
    public static boolean compare(char[] arr1, char[] arr2) {
        
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s1 = scn.nextLine();


        char[]arr=get(s1);
        char[]build=s1.toCharArray();

        boolean isSame=compare(arr,build);;
        System.out.println("manual toCharArray ");
        for(char ch:arr){
            System.out.print(ch);
        }
        System.out.println("manual toCharArray ");
        for(char ch:build){
            System.out.print(ch);
        }
        System.out.println("compare both "+ isSame);
    }
}
