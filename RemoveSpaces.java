import java.util.*;
public class RemoveSpaces {
    private static String removeSpaces(String s){
        String res = "";
        for(char ch : s.toCharArray()){
            if(ch!=' '){
                res+=ch;
            }
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = removeSpaces(str);
        System.out.println(result);
        sc.close();
    }
}