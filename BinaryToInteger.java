import java.util.*;

public class BinaryToInteger {
    private static int binaryToInteger(String s){
        return Integer.parseInt(s,2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int number = binaryToInteger(str);
        System.out.println(number);
        sc.close();
    }
}
