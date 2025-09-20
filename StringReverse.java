import java.util.*;

public class StringReverse{
    private static String reverseString(String s){
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String reversed = reverseString(str);
        System.out.println(reversed);
        sc.close();
    }
}