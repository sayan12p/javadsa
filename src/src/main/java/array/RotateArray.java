package array;

import java.util.ArrayDeque;
import java.util.Arrays;

public class RotateArray {

    public static void rotate(int[] nums, int k) {
        ArrayDeque<Integer> queue=new ArrayDeque<>();
        for(int i=nums.length-k;i<nums.length;i++){
            queue.offer(nums[i]);
        }
        System.out.println(queue);
        for(int i=nums.length-k-1;i>=0;i--){
            nums[i+k]=nums[i];
        }
        for(int i=0;i<=k-1;i++){
            nums[i]=queue.poll();
        }

    }

    public static void main(String[] args) {
        int[] nums=new int[]{1,2,3,4,5,6,7};
        rotate(nums,3);
        System.out.println(Arrays.toString(nums));
    }
}
