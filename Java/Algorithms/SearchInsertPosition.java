package Algorithms;

class SearchInsertPosition {
 
        public static int firstBadVersion(int n) {
    
            int low = 1, high = n;
    
            while(low < high){
                int mid = low + ( high - low ) / 2;
                if(isBadVersion(mid)) {
                    high = mid;
                } else {
                    low = mid + 1;
                }
            }
            return low;
    
            
        }

    public static void main(String[] args) {
        int x = 5;
        System.out.println(firstBadVersion(x));
        
    }
}