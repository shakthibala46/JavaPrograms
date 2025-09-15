import java.util.*;

class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        int top=0,bottom=matrix.length-1,left=0,right=matrix[0].length-1;
        List<Integer> list = new ArrayList<>();
        while(left<=right && top<=bottom){
        for(int i=left;i<=right;i++){
            list.add(matrix[top][i]);
        }top++;

        for(int i=top;i<=bottom;i++){
            list.add(matrix[i][right]);
        }right--;
        if(left<=right && top<=bottom){
        for(int i=right;i>=left;i--){
            list.add(matrix[bottom][i]);
        }bottom--;
        }
        if(top<=bottom && left<=right){
        for(int i=bottom;i>=top;i--){
            list.add(matrix[i][left]);
        }left++;
    }
    }
     return list;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(spiralOrder(arr));
        sc.close();
    }
}