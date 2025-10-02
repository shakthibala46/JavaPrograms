import java.util.*;

public class Anagram {
    private static boolean findAnagramOrNot(String str1 , String str2){
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        boolean b = findAnagramOrNot(s1,s2);
        System.out.println(b ? "Yes, it's anagram." : "No, it's not anagram.");
        sc.close();
    }
}
