
public class Circular_Queue {
    int arr[];
int front;
int rear;
int max;
Circular_Queue(int size)
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
      
        arr[rear] = x;
        System.out.println(front+ " "+rear);
        rear=(rear+1)%max;
        
        
	}

	public int pop()
	{
		
		if (isEmpty())
		{
			System.out.println("UnderFlow");
			System.exit(1);
		}

       
        int ret=arr[front];
        front=(front+1)%max;
       
		System.out.println(ret);
		return ret;
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
        if((front)%max==rear )
        return true;
        else
        return false;
    }
	public Boolean isFull()
	{
		return (rear+1)%max==front ;	// or return size() == max;
	}





    public static void main(String args[])
    { Circular_Queue q=new Circular_Queue(4);
        q.push(1);
        q.push(170);
        q.push(90);
      
        q.pop();
        q.pop();
        q.pop();
        q.push(678);
        q.pop();
        q.pop();
        q.pop();
       
        

      
       
       


    }

}