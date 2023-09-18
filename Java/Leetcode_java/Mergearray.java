

class Mergearray {
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int newarr[] = new int[m+n];
        int count1=0, count2=0,count3=1,count4=0;
        for(int i=0; count4<newarr.length; i++){ 
            
           if(nums1[count1]<=count3 && nums1[count1]!=0){
                newarr[count4]=nums1[count1];
                count1++;
                count4++;
           }
           if(nums2[count2]<=count3 && nums2[count2]!=0){
                 newarr[count4]=nums2[count2];
                 count2++;
                 count4++;
           } else {
            count3++;
           }         
        }
        return newarr;
    }



    public static void main(String[] args) {
       int arr[] = {1,2,3,4,0,0,0};
       int arr2[] = {2,5,6,9};

       int newarr[] =merge(arr,4,arr2,4);
        for (int i : newarr) {
            System.out.print(i+" ,");
            
        }
            
            
        
    }
}