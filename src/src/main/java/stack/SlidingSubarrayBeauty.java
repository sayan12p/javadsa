package stack;

import java.util.*;

public class SlidingSubarrayBeauty {

    public static Integer[] getSubarrayBeauty(int[] nums, int k, int x) {
        TreeMap<Integer,Integer> map=new TreeMap<>();
        int n=nums.length; Integer[] ans=new Integer[n-k+1];
        for(int i=0;i<k;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        ans[0]=getsecondmin(map,x);
        for(int i=k;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            map.put(nums[i-k],map.getOrDefault(nums[i-k],0)-1);
            if(map.get(nums[i-k])==0) map.remove(nums[i-k]);
            ans[i-k+1]=getsecondmin(map,x);
        }
        return ans;
    }

    public static int getsecondmin(TreeMap<Integer,Integer> map,int x){
        int smallest=0;
        for(Integer val: map.keySet()) {
            if (val < 0) {
                smallest += map.get(val);
            } else return 0;
            if (smallest >= x) {
                return val;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] nums=new int[]{1,-1,-3,2,3};
        System.out.println(Arrays.toString(getSubarrayBeauty(nums,3,2)));
    }
}
