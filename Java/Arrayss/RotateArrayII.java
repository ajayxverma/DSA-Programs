package Arrayss;

public class RotateArrayII {

    public static void rotate(int[] nums, int k) {
        k+=1;
        int[] temp = new int[k];
        int len = nums.length;
        int p = 0;
        for(int i = 0; i < nums.length; i++) {
            if(i <= k && k+i < len) {
                temp[i] = nums[i];
                nums[i] = nums[k+i];
            } else if (i < k) {
                temp[i] = nums[i];
                nums[i] = temp[p];
                p++;
            } else {
                nums[i] = temp[p];
                p++;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};

        rotate(arr, 3);
        System.out.println(arr);
        
    }
    
}
