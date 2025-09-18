import java.util.*;

public class FindFactorial {
    public static int factorial(int k){
        if(k==0 | k==1) return 1;
        return k*factorial(k-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
        sc.close();
    }
}
