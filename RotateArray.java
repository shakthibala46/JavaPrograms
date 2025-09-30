import java.util.*;

public class RotateArray {
    private static List<Integer> rotateArray(List<Integer> li , int r){
        Collections.rotate(li,r);
        return li;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int size = sc.nextInt();
        for(int i=0;i<size;i++){
            list.add(sc.nextInt());
        }
        int rotates = sc.nextInt();
        System.out.println(rotateArray(list,rotates));
        sc.close();
    }
}
