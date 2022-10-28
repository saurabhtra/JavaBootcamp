package com.LeetCode.binarySearch;

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int k = 2;
        int ans = findingLargestSum(nums, k);
        System.out.println(ans);
    }
    static int findingLargestSum(int[] nums, int m){
        int start = 0;
        int end = 0;
        //range of our potential ans will be [start, end]
        for (int num: nums
             ) { start = Math.max(start, num);
            end += num;

        }
//        System.out.println("start " + start + "  end " + end);
        //appling binary search in our ans range
        while (start < end) {
            int count = 1;//counting the number of sub arrays formed
            int sum = 0;//store the largest sum among these arrays
            int mid = start + (end - start) / 2;
            for (int num : nums
            ) {

                if (sum + num > mid) {
                    count++;
                    sum = num;
                } else {
                    sum += num;
                }

            }
            if (count > m) {
                start = mid + 1;
            } else {
                end = mid;
            }

        }
        return end;
    }
}
