class PatternTest {
    public static void main(String[] args) {

		int n=7;
			//logic for upper pyramid
		//this loop decides no of rows
		for (int rows=0;rows<n-1 ;rows++ )
		{
			//this loop decides no of spaces in a col
			for (int space=0 ;space<n-1-rows ;space++ )
			{
				System.out.print("  ");
			}
			//this loop decides no of stars in a col
			for (int star=0;2*rows>=star ;star++ )
			{
				System.out.print("* ");
			}
			System.out.println();
		}

		//logic for inverse pyramid
		//this loop decides no of rows
		for (int rows=n-1;rows>=0 ;rows-- )
		{
			//this loop decides no of spaces in a col
			for (int space=0 ;space<n-1-rows ;space++ )
			{
				System.out.print("  ");
			}
			//this loop decides no of stars in a col
			for (int star=0;2*rows>=star ;star++ )
			{
				System.out.print("* ");
			}
			System.out.println();
		}

    }
}