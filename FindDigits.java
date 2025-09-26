import java.util.*;

public class FindDigits {
    private static int findDigits(String s){
        String n = "";
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                n+=ch;
            }
        }
        return Integer.parseInt(n);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int nums = findDigits(str);
        System.out.println(nums);
        sc.close();
    }
}
