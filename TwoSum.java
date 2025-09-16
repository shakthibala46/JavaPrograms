/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1] */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {
     public static int[] twoSum(int[] arr, int target) {
       Map<Integer,Integer> map = new HashMap<>();
       for(int i=0;i<arr.length;i++){
        int c = target - arr[i];
        if(map.containsKey(c)){
            return new int[]{map.get(c),i};
        }
        map.put(arr[i],i);
       }
       throw new IllegalArgumentException("No two sum solution");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        int[] res = (twoSum(array,t));
        System.out.println("Add element in Index : " + res[0] + " and Index " + res[1] + " to get target value " + t +".");
        sc.close();
    }
}
