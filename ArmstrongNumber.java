import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), sum = 0, temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, 3);
            temp /= 10;
        }
        if (sum == num)
            System.out.println(num + " is Armstrong");
        else
            System.out.println(num + " is not Armstrong");
            sc.close();
    }
}
