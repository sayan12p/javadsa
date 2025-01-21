package slidingwindow;

public class BinarySubarraysWithSum {

    public static int numSubarraysWithSum(int[] nums, int goal) {
        //your code goes here
        return numSubArrayHelper(nums,goal)-numSubArrayHelper(nums,goal-1);
    }

    private static int numSubArrayHelper(int[] nums, int goal) {

        int l=0; int r=0; int sum=0;int count =0;
        if(goal<0) return 0;
        while(r<nums.length){
            sum+=nums[r];
            while(sum>goal){
                sum-=nums[r];
                l++;

            }
            count+=(r-l+1);
            r++;
        }
        return count;
    }


    public static void main(String[] args) {
    int[] nums=new int[]{0, 0, 0, 0, 1};
        System.out.println(numSubarraysWithSum(nums,0));
    }

}
