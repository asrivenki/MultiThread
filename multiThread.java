
///https://www.youtube.com/watch?v=wqkVCkeObsE
class myThread implements Runnable
{
	public static String winner;
	boolean flag = false;
	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		
		System.out.println("Thread group " + Thread.currentThread().getThreadGroup().getName() + "Thread name " + Thread.currentThread().getName());
		String name = Thread.currentThread().getName();
		String s[] = name.split("\\s");
		
		if(Thread.currentThread().getThreadGroup().getName().equals("G1"))
		{
			
			try {
				int threadcount  = Integer.parseInt(s[1].charAt(1) +"");
				for(int i=1;i<threadcount; i++)
					multiThread.t1[i-1].join();	
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(Thread.currentThread().getThreadGroup().getName().equals("G2"))
		{
			
			try {
				int threadcount  = Integer.parseInt(s[1].charAt(1) +"");
				for(int i=1;i<threadcount; i++)
					multiThread.t2[i-1].join();	
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(Thread.currentThread().getThreadGroup().getName().equals("G3"))
		{
			
			try {
				int threadcount  = Integer.parseInt(s[1].charAt(1) +"");
				for(int i=1;i<threadcount; i++)
					multiThread.t3[i-1].join();	
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(Thread.currentThread().getThreadGroup().getName().equals("G4"))
		{
			
			try {
				int threadcount  = Integer.parseInt(s[1].charAt(1) +"");
				for(int i=1;i<threadcount; i++)
					multiThread.t4[i-1].join();	
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(Thread.currentThread().getThreadGroup().getName().equals("G5"))
		{
			
			try {
				int threadcount  = Integer.parseInt(s[1].charAt(1) +"");
				for(int i=1;i<threadcount; i++)
					multiThread.t5[i-1].join();	
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		int distance;
		for(distance=1; distance<=100; distance++)
		{
			/*String name = Thread.currentThread().getName();
			String s[] = name.split("\\s");*/
			if(raceWon(s[0], s[1], distance) == true)
				break;
			System.out.println("Thread group " + Thread.currentThread().getThreadGroup().getName() + "Thread name " + Thread.currentThread().getName() + " distance " + distance);
			
		}
		
	}
	
	public boolean raceWon(String GroupName, String threadName, int distance)
	{
		if(winner != null)
		{
			if(flag == false)
			{
				int threadcount  = Integer.parseInt(threadName.charAt(1) +"");
				distance  = 500 - (threadcount*100) + (100 - distance);
				System.out.println(" Group " + GroupName +" lost by" + distance + " ");
				flag = true;
			}
			return true;
		}
		else if(distance == 100)
		{
			if(threadName.equals("T5"))
			{
				winner = GroupName;
				System.out.println(" Winner is " + winner );
			}
			else
			{
				
			}
			return true;
		}
		else
		{
			return false;
		}
	}
}

public class multiThread {

	public static Thread[] t1 = new Thread[5];
	public static Thread[] t2 = new Thread[5];
	public static Thread[] t3 = new Thread[5];
	public static Thread[] t4 = new Thread[5];
	public static Thread[] t5 = new Thread[5];
	
	public static void main(String[] args) 
	{
		//Group 1
		myThread m1 = new myThread();
		ThreadGroup g1 = new ThreadGroup("G1");
		for(int i=1; i<=5; i++)
		{
			String threadName  = "G1 " +"T" +i;
			t1[i-1] = new Thread(g1,m1,threadName);
			t1[i-1].start();
		}
		
		myThread m2 = new myThread();
		ThreadGroup g2 = new ThreadGroup("G2");
		for(int i=1; i<=5; i++)
		{
			String threadName  = "G2 " +"T" +i;
			t2[i-1] = new Thread(g2,m2,threadName);
			t2[i-1].start();
		}
		
		myThread m3 = new myThread();
		ThreadGroup g3 = new ThreadGroup("G3");
		for(int i=1; i<=5; i++)
		{
			String threadName  = "G3 " +"T" +i;
			t3[i-1] = new Thread(g3,m3,threadName);
			t3[i-1].start();
		}
		
		myThread m4 = new myThread();
		ThreadGroup g4 = new ThreadGroup("G4");
		for(int i=1; i<=5; i++)
		{
			String threadName  = "G4 " +"T" +i;
			t4[i-1] = new Thread(g4,m4,threadName);
			t4[i-1].start();
		}
		
		myThread m5 = new myThread();
		ThreadGroup g5 = new ThreadGroup("G5");
		for(int i=1; i<=5; i++)
		{
			String threadName  = "G5 " +"T" +i;
			t5[i-1] = new Thread(g5,m5,threadName);
			t5[i-1].start();
		}
	}

}
