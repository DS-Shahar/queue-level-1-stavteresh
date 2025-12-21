public class Main
{
	public static void main(String[] args) {
		Queue<Integer> q = new Queue<Integer>();
	    q.insert(7);
	    q.insert(7);
	    q.insert(2);
	    q.insert(5);
	    
	    Queue<Integer> q2 = new Queue<Integer>();
	    q2.insert(21);
	    q2.insert(15);
	    q2.insert(30);
	    
	    System.out.println(ex1(q));
	    System.out.println(ex2(q));
	    System.out.println(ex3(q, 45));
	    System.out.println(ex4(q, q2));
	    System.out.println(ex5(q, 7));
	    
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
	

	
	public static double ex2(Queue<Integer> h)
	{
       Queue<Integer> q = ex1(h);
	    double sum = 0;
	    int count = 0;
	    while(!q.isEmpty())
	    {
	        sum = sum + q.remove();
	        count++;
	    }
	    return sum/count;
	}
	
	public static int ex3(Queue<Integer> h, int x)
	{
	    Queue<Integer> q = ex1(h);
	    int count = 0;
	    while(!q.isEmpty())
	    {
	        if(x%q.remove()==0)
	            count++;
	    }
	    return count;
	}
	
	public static boolean ex4(Queue<Integer> h1, Queue<Integer> h2)
	{
	    Queue<Integer> q1 = ex1(h1);
	    Queue<Integer> q2 = ex1(h2);
	    boolean condition;
	    while(!q1.isEmpty())
	    {
	        q2 = ex1(h2);
	        condition = false;
	        while(!q2.isEmpty())
	        {
	            if(q2.remove()%q1.head()==0)
	                condition = true;
	        }
	        
	        q1.remove();
	        
	        if(!condition)
	        {
	            return false;
	        }
	    }
	    return true;
	   
	}
	
	public static boolean ex5(Queue<Integer> h1, int x)
	{
	    Queue<Integer> q1 = ex1(h1);
	    while(!q1.isEmpty())
	    {
	        int k = q1.remove();
	        if(q1.isEmpty())
	            return false;
	        if(k==q1.head()&&q1.head() == x)
	            return true;
	    }
	    return false;
	}

	
	
}
