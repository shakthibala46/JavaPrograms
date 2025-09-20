import java.util.*;

public class FindMaxValue {
    private static int findMaxValue(int[] array){
        int max = 0;
        for(int k : array){
            if(k > max){
                max = k;
            }
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int maxValue = findMaxValue(arr);
        System.out.println(maxValue);
        sc.close();
    }
}
