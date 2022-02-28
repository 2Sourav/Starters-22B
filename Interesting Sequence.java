/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t;
		t=sc.nextInt();
		while(t-->0)
		{
		    int k; k=sc.nextInt(); int ans=0;
		    while ( k % 2 == 0)
    {
        k = k/2;
        ans++;
    }
    System.out.println(ans);
		}
	}
}
