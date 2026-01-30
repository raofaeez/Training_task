package LinearAndBinary;

import java.util.HashSet;
import java.util.Scanner;

public class removeDuplicate{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String input=scn.next();
        StringBuilder s=new StringBuilder();
        HashSet<Character> set=new HashSet<>();

        for(char ch:input.toCharArray()){
            if(!set.contains(ch)){
                s.append(ch);
            }
            set.add(ch);
        }
        System.out.println(s);
    }
}
