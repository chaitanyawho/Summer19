
import java.util.*; 

class Consecutivek_Min { 
	
	
	public static int maxSum(int arr[], int n, int k) 
	{ 
		
		if (n < k) 
		{ 
		return -1; 
		} 
	
		
		int res = 0; 
		for (int i=0; i<k; i++) //initial sum to subtract and add from
		res += arr[i]; 
	
		//sums of remaining windows by removing first ele of pre and adding last element of curr 
		int comp = res; 
		for (int i=k; i<n; i++) 
		{ 
		comp += arr[i] - arr[i-k]; 
		res = Math.min(res, comp); 
		} 
	
		return res; 
	} 
	

	public static void main(String[] args) 
	{ 
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        int k=sc.nextInt();
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
		
		

		System.out.println(maxSum(arr, n, k)); 
	} 
} 