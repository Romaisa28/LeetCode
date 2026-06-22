import java.util.Scanner;
import java.util.Arrays;

public class removeDupFromSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array. ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        System.out.println("Enter elements of array. ");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        removeDuplicates(nums);
    }

    public static int removeDuplicates(int[] nums) {
        int k = 1;
        if (nums.length == 0) {
            System.out.println("Array is empty. ");
            return 0;
        } else {
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != nums[i - 1]) {
                    nums[k] = nums[i];
                    k++;
                }
            }
        }

        System.out.print(k + ", ");
        System.out.print("nums = [");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + ", ");
        }
        System.out.print("]");
        return k;
    }
}
