
import java.util.Scanner;

public class lengthManual {
    public static int get(String s){
        int cnt=0;
        try {
            s.charAt(cnt);
            cnt++;
        } catch (StringIndexOutOfBoundsException e) {
            return cnt;
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();


        int manLenght=get(str);
        int buildLen=str.length();
        System.out.println("manual leng "+ manLenght);
        System.out.println("built in len "+ buildLen);
    }
}
