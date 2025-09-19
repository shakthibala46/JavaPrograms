import java.util.*;

public class IntegerToBinary {
    private static String convertIntoBinary(int n){
        return Integer.toBinaryString(n);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String binary = convertIntoBinary(a);
        System.out.println(binary);
        sc.close();
    }
}
