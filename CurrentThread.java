class Loop extends Thread{
	public void run(){
		for(int i=0;i<8;i++)
		{
				System.out.println( "The process/thread ID is " +  Thread.currentThread().getId() + "and value of i is " +i);
				Thread.sleep(5);
		}
	}
}

public class Multithread{
	public static void main(String args[])
	{
	 	
		Loop obj1 = new Loop();
		obj1.start();
		Loop obj2 = new Loop();
		obj2.start();
		
	}
}