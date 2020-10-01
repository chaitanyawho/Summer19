
public class Queue {

int arr[];
int front;
int rear;
int max;
Queue(int size)
{    arr=new int[size];
     front=0;
     rear=0;
     max=size;

}
public void push(int x)
	{
		if (isFull())
		{
			System.out.println("OverFlow\nProgram Terminated\n");
			System.exit(1);
		}

		System.out.println("Inserting " + x);
        arr[rear++] = x;
        System.out.println(front+ " "+rear);
	}

	public int pop()
	{
		
		if (isEmpty())
		{
			System.out.println("UnderFlow");
			System.exit(1);
		}

		

		
		return arr[front++];
	}

	// Utility function to return top element in a stack
	public int peek()
	{
		if (!isEmpty())
			return arr[front];
		else
			System.exit(1);

		return -1;
	}

	// Utility function to return the size of the stack


	public Boolean isEmpty()
	{
        if(front==rear )
        return true;
        else
        return false;
    }
	public Boolean isFull()
	{
		return rear == max ;	// or return size() == max;
    }
    public void print()
    {
        int s=front;
        
        int e=rear;
        while(s !=(e))
        {
            System.out.println(arr[s]);
            s++;


        }


    }

    public static void main(String args[])
    { Queue q=new Queue(6);
        q.push(1);
        q.push(100);
        q.push(677);
        q.push(1234);
        q.pop();
      q.print();


    }

}