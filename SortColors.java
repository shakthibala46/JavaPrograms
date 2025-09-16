/*Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

 

Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2] */
import java.util.*;

public class SortColors {
    public  static void sort(int[] arr){
        int left = 0;
        int mid = 0;
        int right = arr.length-1;
        while(mid<=right){
            if(arr[mid]==0){
                int temp = arr[left];
                arr[left] = arr[mid];
                arr[mid] = temp;
                left++;
                mid++;
            }else if(arr[mid]==1){
                mid++;
            }else{
                int temp = arr[right];
                arr[right] = arr[mid];
                arr[mid] = temp;
                right--;
            }
        }

        for(int i : arr){
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }
        sort(array);
        sc.close();
    }
}
