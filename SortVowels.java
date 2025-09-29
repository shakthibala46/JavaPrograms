import java.util.*;
public class SortVowels {
    public  static String sortVowels(String s) {
        List<Character> vowels = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if ("AEIOUaeiou".indexOf(c) != -1) {
                vowels.add(c);
            }
        }

        Collections.sort(vowels);

        StringBuilder result = new StringBuilder();
        int vIndex = 0;
        for (char c : s.toCharArray()) {
            if ("AEIOUaeiou".indexOf(c) != -1) {
                result.append(vowels.get(vIndex++));
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = sortVowels(str);
        System.out.println(result);
        sc.close();
    }
}