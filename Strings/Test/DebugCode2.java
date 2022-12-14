package Strings.Test;
import java.util.*;
public class DebugCode2 {
// Java program to find the longest
// repeatings ubsequence

	// Function to find the longest repeating subsequence
	static String findLongestRepeatingSubSeq(String str)
	{
		int n = str.length();

		// Create and initialize DP table
		String[][] dp = new String[n+1][n+1];
		System.out.println(dp[1][1]);

		// Fill dp table (similar to LCS loops)
		for (int i=1; i<=n; i++)
		{
			for (int j=1; j<=n; j++)
			{
				// If characters match and indexes are not same
				if (str.charAt(i-1) == str.charAt(j-1) && i!=j){
					dp[i][j] =  dp[i-1][j-1]+str.charAt(i-1);		
					
				// If characters do not match
				}else{
					if(dp[i][j-1]==null|| dp[i-1][j]==null)
						continue;
					else if(dp[i][j-1].length()> dp[i-1][j].length())
						dp[i][j] = dp[i][j-1];
					else
					dp[i][j] = dp[i-1][j];
				}

			}
		}
		return dp[n][n];
	}
	
	// driver program to check above function
	public static void main (String[] args)
	{
		String str = "aabb";
		System.out.println("The length of the largest subsequence that"
			+" repeats itself is : "+findLongestRepeatingSubSeq(str));
	}
}

// This code is contributed by Pramod Kumar


    
