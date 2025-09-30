import java.util.*;

public class FindOccurance {
    private static Map<Character,Integer> findOccurances(String s){
        Map<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        return map;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Map<Character,Integer> res = findOccurances(str);
        for(Map.Entry<Character,Integer> ent : res.entrySet()){
            System.out.println(ent.getKey() + " - " + ent.getValue());
        }
        sc.close();
    }
}
