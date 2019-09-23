package com.leet.code.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by lining on 2019/9/23.
 *
 */
public class TwoSum {

    public static void main(String[] args) {
//        int[] nums = {2, 7, 11, 15};
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] results = twoSum(nums, target);
        System.out.println(results[0]);
        System.out.println(results[1]);
    }

    /**
     * 获取数组中任意两个元素之和等于target的下标
     * @param nums 数组
     * @param target 目标值
     * @return 两个元素的下标
     */
    public static int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        int[] result = new int[2];
        for (int i = 0; i < length; i++) {
            int differenceValue = target - nums[i];
            int index = getIndex(nums, differenceValue, i);
            if (index != -1) {
                result[0] = i;
                result[1] = index;
                return result;
            }
        }
        return null;
    }

    /**
     * 获取数组中某元素的下标
     * @param nums 数组
     * @param value 当前元素与目标值的差值
     * @param currentNumIndex 当前元素的下标
     * @return 元素在数组中的下标
     */
    public static int getIndex(int[] nums, int value, int currentNumIndex) {
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == value && i != currentNumIndex) {
                index = i;
                break;
            }
        }
        return index;
    }

//    /**
//     * 该方法很妙，先将数组元素添加至Map集合，直到在集合中找到与当前元素和为target的元素，并返回下标
//     * @param nums
//     * @param target
//     * @return
//     */
//    public int[] twoSum(int[] nums, int target) {
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            int complement = target - nums[i];
//            if (map.containsKey(complement)) {
//                return new int[] { map.get(complement), i };
//            }
//            map.put(nums[i], i);
//        }
//        throw new IllegalArgumentException("No two sum solution");
//    }
//
//    /**
//     * 该方法属于蛮力法，一个个去试，直到满足条件
//     * @param nums
//     * @param target
//     * @return
//     */
//    public int[] twoSum(int[] nums, int target) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[j] == target - nums[i]) {
//                    return new int[] { i, j };
//                }
//            }
//        }
//        throw new IllegalArgumentException("No two sum solution");
//    }

}
