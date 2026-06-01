package WEEK1.DAY1;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            int res = target - nums[i];
            if(map.containsKey(res)){
                return new int[]{map.get(res),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 15;
        int[] ans = twoSum(nums, target);
        System.out.println(Arrays.toString(ans));
    }
    
}
