class Loop extends Thread{
	public void run(){
	int[] arr = {1,5,8,2,3,7};
	int i;
     	for(i=0;i<=5;i++)
	{
		System.out.println("The value at " +i+ "is " +arr[i]);
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