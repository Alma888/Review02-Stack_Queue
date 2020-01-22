//三数之和：
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNums {
    public static List<List<Integer>> threeSum(int[] nums) {
        //先将数组元素从小到大排序
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                while (j < k && nums[i] + nums[j] + nums[k] < 0) {
                    j++;
                }
                if (j >= k) {
                    break;
                }
                if (nums[i] + nums[j] + nums[k] == 0) {
                    List<Integer> e = new ArrayList<>();
                    e.add(nums[i]);
                    e.add(nums[j]);
                    e.add(nums[k]);
                    result.add(e);
                    while (j < k && nums[j] == nums[j + 1]) {
                        j++;
                    }
                    j++;
                }

                while (j < k && nums[i] + nums[j] + nums[k] > 0) {
                    k--;
                }
                if (j >= k) {
                    break;
                }
                if (nums[i] + nums[j] + nums[k] == 0) {
                    List<Integer> e = new ArrayList<>();
                    e.add(nums[i]);
                    e.add(nums[j]);
                    e.add(nums[k]);
                    result.add(e);
                    while (j < k && nums[k] == nums[k - 1]) {
                        k--;
                    }
                    k--;
                }
            }

            while (i < nums.length - 2 && nums[i] == nums[i+1]) {
                i++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        System.out.println(threeSum(nums));
    }
}