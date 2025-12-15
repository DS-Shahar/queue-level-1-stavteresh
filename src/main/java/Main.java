public class Main
{
	public static void main(String[] args) {
		Queue<Integer> q = new Queue<Integer>();
	    q.insert(9);
	    q.insert(2);
	    q.insert(5);
	    
	    System.out.println(ex1(q));
	    System.out.println(ex2(q));
	}
	
	public static Queue<Integer> ex1(Queue<Integer> q)
	{
	    Queue<Integer> h = new Queue<Integer>();
	    Queue<Integer> q2 = new Queue<Integer>();
	    while(!q.isEmpty())
	    {
	        q2.insert(q.head());
	        h.insert(q.remove());
	    }
	    while(!q2.isEmpty())
	    {
	        q.insert(q2.remove());
	    }
	    return h;
	}
	

	
	public static int ex2(Queue<Integer> h)
	{
      Queue<Integer> q = ex1(h);
	    int avg = 0;
	    int sum = 0;
	    Queue<Integer> h = q;
	    while(!q.isEmpty())
	    {
	        avg = avg + q.remove();
	        sum++;
	    }
	    return avg/sum;
	}
	
	
	
	
}
