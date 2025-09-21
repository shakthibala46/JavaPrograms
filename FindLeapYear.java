import java.util.*;

public class FindLeapYear{
    private static boolean isLeapYear(int n){
        if ((n % 400 == 0) || (n % 4 == 0 && n % 100 != 0)){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        boolean leap = isLeapYear(year);
        System.out.println(leap ? "Yes, this is a leap year." : "No, this is not a leap year.");
        sc.close();
    }
}