/* Given a sorted array of distinct integers and a target value, return the index if the target is found. 
 If not, return the index where it would be if it were inserted in order.

 You must write an algorithm with O(log n) runtime complexity
 */
package Arrays;


public class searchinsert {

    
    public int searchInsert(int[] nums, int target) {


        int pos=0;
        
        for (int i = 0; i < nums.length; i++) {

            if(target==nums[i]){
                return i;  
            } 
           if ( target>nums[i]) {
                pos=i+1;

            } 
            
        }
        return pos;   
    }
    public static void main(String[] args) {

        int nums[] ={ 1,3,5,6,7,9};

        int target = 8;
        searchinsert search = new searchinsert();
        int pos =search.searchInsert(nums,target);
        System.out.println(" the position is "+pos);

        
    }
}
