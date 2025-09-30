import java.util.Scanner;

public class FindIndex {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String find = sc.nextLine();
        System.out.println(str.indexOf(find));
        sc.close();
    }
}
