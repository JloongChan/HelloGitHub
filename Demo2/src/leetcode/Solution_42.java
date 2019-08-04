package leetcode;

/**
 * 42. 接雨水
 *
 * 给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。
 *
 *
 *
 * 上面是由数组 [0,1,0,2,1,0,1,3,2,1,2,1] 表示的高度图，在这种情况下，可以接 6 个单位的雨水（蓝色部分表示雨水）。 感谢 Marcos 贡献此图。
 *
 * 示例:
 *
 * 输入: [0,1,0,2,1,0,1,3,2,1,2,1]
 * 输出: 6
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/trapping-rain-water
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
class Solution_42 {
    int point = 0; // 游标 初始为0
    int sum = 0; // 水滴总和

    public int trap(int[] height) {
        loop(height);
        return sum;
    }

    public void loop(int[] height) {
        int startIndex = point;
        int tempIndex = startIndex + 1;
        for (int i = tempIndex; i < height.length; i++) {
            if (height[i] >= height[startIndex]) {
                tempIndex = i;
                break;
            } else {
                tempIndex = height[i] >= height[tempIndex] ? i : tempIndex;
            }
        }
        calculate(height, startIndex, tempIndex);
        point = tempIndex;
        if (point < height.length - 1) {
            loop(height);
        }
    }

    public void calculate(int[] height, int startIndex, int endIndex) {
        if (endIndex - startIndex == 1) {
            return;
        }
        int min = height[startIndex] <= height[endIndex] ? height[startIndex] : height[endIndex];
        int subSum = min * (endIndex - startIndex - 1);
        for (int i = startIndex + 1; i < endIndex; i++) {
            subSum = subSum - height[i];
        }
        sum += subSum;
    }
}