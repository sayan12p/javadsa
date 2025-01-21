package prefixsum;

import java.util.Arrays;

public class LeftandRightSumDifferences {

    public static int[] leftRightDifference(int[] nums) {
        int[] leftsum=new int[nums.length];
        int[] rightsum=new int[nums.length];
        int[] result=new int[nums.length];
        leftsum[0]=0;
        rightsum[nums.length-1]=0;
        for(int i=1;i<nums.length;i++) {
            leftsum[i]=leftsum[i-1]+nums[i-1];
        }
        for(int i=nums.length-2;i>=0;i--) {
            rightsum[i]=rightsum[i+1]+nums[i+1];
        }
        System.out.println(Arrays.toString(leftsum));
        System.out.println(Arrays.toString(rightsum));
        for(int i=0;i<result.length;i++){
            result[i]=Math.abs(leftsum[i]-rightsum[i]);
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(leftRightDifference(new int[]{10, 4, 8, 3})));
    }
}
