import java.util.*;

class Stack
{
	 int arr[];
	 int top;
	 int max;

	// Constructor to initialize stack
	Stack(int size)
	{
		arr = new int[size];
		max = size;
		top = -1;
	}

	// Utility function to add an element x in the stack
	public void push(int x)
	{
		if (isFull())
		{
			System.out.println("OverFlow\nProgram Terminated\n");
			System.exit(1);
		}

		System.out.println("Inserting " + x);
		arr[++top] = x;
	}

	public int pop()
	{
		
		if (isEmpty())
		{
			System.out.println("UnderFlow");
			System.exit(1);
		}

		

		
		return arr[top--];
	}

	// Utility function to return top element in a stack
	public int peek()
	{
		if (!isEmpty())
			return arr[top];
		else
			System.exit(1);

		return -1;
	}

	// Utility function to return the size of the stack
	public int size()
	{
		return top + 1;
	}

	public Boolean isEmpty()
	{
        return top == -1;
    }
	public Boolean isFull()
	{
		return top == max - 1;	// or return size() == max;
	}

	public static void main (String[] args)
	{
		Stack stack = new Stack(3);

		stack.push(1);		
		stack.push(2);		

		stack.pop();	
		stack.pop();		

		stack.push(3);		// Inserting 3 in the stack

		System.out.println("Top element is: " + stack.peek());
		System.out.println("Stack size is " + stack.size());

		stack.pop();		// removing the top 3

		// check if stack is empty
		if (stack.isEmpty())
			System.out.println("Stack Is Empty");
		else
			System.out.println("Stack Is Not Empty");
	}
}