package com.LeetCode.Arrays;

import java.util.Arrays;

/*\
Given two arrays of integers nums and index. Your task is to create target array under the following rules:

Initially target array is empty.
From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
Repeat the previous step until there are no elements to read in nums and index.
Return the target array.

It is guaranteed that the insertion operations will be valid.



Example 1:

Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
Output: [0,4,1,3,2]
Explanation:
nums       index     target
0            0        [0]
1            1        [0,1]
2            2        [0,1,2]
3            2        [0,1,3,2]
4            1        [0,4,1,3,2]

Constraints:

1 <= nums.length, index.length <= 100
nums.length == index.length
0 <= nums[i] <= 100
0 <= index[i] <= i
 */
public class TargetArrayInOrder {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,0};
        int[] index = {0,1,2,3,0};
        int len = nums.length;
        int[] target = new int[len];
        for (int i = 0; i < len; i++) {
            target[i] = -1;

        }
        System.out.println(Arrays.toString(target));
        for (int i = 0; i < nums.length; i++){
            if(target[index[i]] == -1){
                target[index[i]] = nums[i];

            }
            else {

                shift(target, index[i], len);
                target[index[i]] = nums[i];


            }
        }
        System.out.println(Arrays.toString(target));

    }
    static void shift(int[] arr, int index, int len){
        for (int i = len -1; i > index; i--) {
            arr[i] = arr[i - 1];

        }

    }
}
