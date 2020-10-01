import java.util.Stack; 
import java.util.Arrays; 
//https://www.youtube.com/watch?v=AKN3Hq_aGOc
public class Ques2 { 
	 
	static void cal(int price[], int n, int Sol[]) 
	{ 
		Stack<Integer> s = new Stack<>(); 
		s.push(0); 

		Sol[0] = 1; 

	//it alway's 1
		for (int i = 1; i < n; i++) { 

			// Pop elements from stack while stack is not 
			// empty and top of stack is smaller than 
            // price[i] that we want to calculate,
            // if stack becomes empty that measn that to the left of price[i] nothing is higher than it is
            //and so s [i] is i+1 including zero
			while (!s.empty() && price[s.peek()] <= price[i]) 
				s.pop(); 

			// Else price[i] 
			// is greater than elements after top of stack so take difference
			Sol[i] = (s.empty()) ? (i + 1) : (i - s.peek()); 

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
		int price[] = { 100, 24, 75, 60, 56}; 
		int n = price.length; 
		int Sol[] = new int[n]; 
		cal(price, n, Sol); 

		
	} 
} 

