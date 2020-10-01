import java.util.Stack; 
import java.util.Arrays;
import java.util.HashMap; 

public class Ques3 { 
	 
	static void cal(int price[], int n, int Sol[]) 
	{ 
		HashMap<Integer,Integer> freq=new HashMap<Integer,Integer>();
		for(int i=0;i<price.length;i++)
		{
			if(freq.containsKey(price[i]))
			{
				freq.put(price[i],freq.get(price[i])+1);
			}
			else
			{
				freq.put(price[i],1);
			}
		}
		Stack<Integer> s = new Stack<>(); 
		s.push(n-1); 

		Sol[n-1] = -1; 

	//it alway's -1 for the right most ele
		for (int i = n-2; i>=0; i--) { 

			// Pop elements from stack while stack is not 
			// empty and top of stack is smaller than 
            // frequency price[i] that we want to calculate,
			// if stack becomes empty that measn that to the right of price[i] no frequency is higher than
			// it is and so s [i] is -1 
            //
			while (!s.empty() && freq.get(price[s.peek()]) <= freq.get(price[i])) 
				s.pop(); 

			// Else price[i] 
			// is greater than elements after top of stack so take difference
			Sol[i] = (s.empty()) ? -1 :  price[s.peek()]; 

			// Push this element index to stack  
			s.push(i); 
        }

        print(Sol);  
	} 


	static void print(int arr[]) 
	{ 
		System.out.print(Arrays.toString(arr)); 
	} 

	public static void main(String[] args) 
	{ 
		int price[] = { 1 ,1,1, 1}; 
		
		//send a frequeny array and once that comes out then replace it , like stock span
		
		int n = price.length; 
		int Sol[] = new int[n]; 
		cal(price, n, Sol); 

		
	} 
} 

