public class test2 {
    public static void main(String[] args) {
        int n=14;
		for (int rows=0;rows<n ;rows++ )
		{
			for (int col=0;col<n;col++ )
			{
				if(rows+col>=n-1)
				{
				System.out.print("* ");
				}
				else
				{
				System.out.print("  ");
				}
			}
			System.out.println();
		}
    }
}
