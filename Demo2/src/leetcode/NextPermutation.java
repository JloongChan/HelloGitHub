package leetcode;

/**
 * 学习 https://leetcode.com/problems/next-permutation/submissions/   下组排列
 *
 * @date 2020-9-26
 */
public class NextPermutation {

    public static void nextPermutation(int[] nums) {
        if (nums.length <= 1) return;
        int i = nums.length - 2;
        // 从后开始找到第一个相隔升序
        while (i >= 0 && nums[i] >= nums[i + 1]) i--;
        if (i >= 0) {
            int j = nums.length - 1;
            // 从后开始找到第一个大于i下标值大的下标j
            while (nums[j] <= nums[i]) j--;
            // 交换i跟j的值
            swap(nums, i, j);
        }
        // 翻转i后面的所有数据
        reverse(nums, i + 1, nums.length - 1);
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void reverse(int[] nums, int i, int j) {
        while (i < j) swap(nums, i++, j--);
    }

    public static void main(String[] args) {
        nextPermutation(new int[]{1, 2, 8, 4, 6, 7, 3, 5});
    }
}
