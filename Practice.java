/**
 * Practice
 */
public class Practice {

    public static void main(String[] args) {
        int n=7;
        for (int i = 0; i <=n-1; i++) {
            for(int j=0; j<n-1-i; j++){
                System.out.print("  ");
            }
            for(int k=0; 2*i>=k; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n-2; i >=0; i--) {
            for(int j=0; j<n-1-i; j++){
                System.out.print("  ");
            }
            for(int k=0; 2*i>=k; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    
}