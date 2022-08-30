public class test3 {
    public static void main(String[] args) {

        int n=5;
        for (int rows=0;rows<=n ;rows++ )
		{
			for (int col=0;col<=n;col++ )
			{
                if( rows<=col){
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
				
			}
			System.out.println();
		}  
    }
 
}
