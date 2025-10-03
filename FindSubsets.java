import java.util.*;

public class FindSubsets {
    public static void generateSubsets(int[] nums, List<Integer> current, int index) {
        if (index == nums.length) {
            System.out.println(current);
            return;
        }

        generateSubsets(nums, current, index + 1);

        current.add(nums[index]);
        generateSubsets(nums, current, index + 1);
        current.remove(current.size() - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Subsets are:");
        generateSubsets(nums, new ArrayList<>(), 0);
        sc.close();
    }
}
