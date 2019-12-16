package cn.leetcode.t15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: liuyuboboboADT
 * @description:
 * @author: WangYiFan
 * @create: 2019-12-16 23:05
 **/

public class Solution {
    public static void main(String[] args){
        Solution s1 = new Solution();
        //int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        //int[] nums = new int[]{-1,0,1,2,-1,-4};
        //int[] nums = new int[]{0,0,0,0,0,0};
        int[] nums = new int[]{-2,0,1,1,2};
       // List<List<Integer>> resultList = s1.threeSum(nums);
        List<List<Integer>> resultList = s1.threeSum2(nums);
        for (List i:resultList) {
            System.out.println(i.toString());
        }
    }


    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> resultList = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int findValue = 0 - nums[i];

            int start = i + 1;
            int end = nums.length - 1;
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            while(start < end){
                if(nums[start] > findValue || nums[start] + nums[end] < findValue){
                    break;
                }
                if (nums[start] + nums[end] == findValue) {
                    resultList.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    //start = end ;
                    start++ ;
                    continue;
                }
                if(nums[start] + nums[end] > findValue){
                    end--;
                }
            }
        }
        return resultList;
    }


    public List<List<Integer>> threeSum2(int[] nums) {

        List<List<Integer>> resultList = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int findValue = 0 - nums[i];

            int start = i + 1;
            int end = nums.length - 1;
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }

            for (int j = start; j <= end;) {
                if(nums[start] > findValue){
                    break;
                }

                if(nums[start] + nums[end] > findValue){
                    end--;
                    continue;
                }

                if(nums[start] + nums[end] == findValue){
                    resultList.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    while(start < end && nums[start] == nums[start+1]){
                        start++;
                    }
                }
            }
        }
        return resultList;
    }
}
