import java.util.*;

public class Fibonacci {
    public static int fib(int k){
        if(k==0) return 0;
        if(k==1) return 1;
        return fib(k-1) + fib(k-2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        for(int i=1;i<=range;i++){
            System.out.print(fib(i) + " ");
        }
        sc.close();
    }
}
