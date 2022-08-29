//Q. Given an array A[], of size N containing positive integers. You need to print the elements of array in increasing order.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main 
{
	public static void main (String[] args) 
	{
       	Scanner sc = new Scanner(System.in);
		   int T = sc.nextInt();
		   for(int a=1; a<=T; a++)
			{
				int N = sc.nextInt();
				int[] Arr = new int[N];
				for(int i=0; i<N; i++)
				{
					Arr[i]= sc.nextInt();
				}
				Arr = arraysort(Arr, N);
				for(int i=0; i<N; i++)
				{
					System.out.print(Arr[i]+" ");
				}
				System.out.print("\n");
			}
	}
	 static int[] arraysort(int[] Arr, int N)
	{	
			if(N==0  || N==1)
			{
				return Arr;
			}
			else
			{
			int temp=0;
			for(int i=0; i<N-1; i++)
			{
				for(int k=0; k<N-1; k++)
				{
					if(Arr[k] > Arr[k+1])
					{
					temp = Arr[k];
					Arr[k] = Arr[k+1];
					Arr[k+1] = temp;
					}
				}
			}
			return Arr;
			}
		          // Your code here
	}
}