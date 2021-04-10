class Thread1 extends Thread
{
	public void run()
	{
		System.out.println("Thread1");
		System.out.println(this.getState());
	}
}

class Thread2 implements Runnable
{
	public void run()
	{
		System.out.println("Thread2");
	}
}
class ThreadMethods
{
	public static void main(String[] args) throws InterruptedException
	{
		Thread1 t1 = new Thread1();
		Thread2 thread2 = new Thread2();
		Thread t2 = new Thread(thread2);
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);	
		System.out.println(t1.getState());
		t1.start();
		t2.start();
		Thread currentThread = Thread.currentThread();
		System.out.println(currentThread.getName());
		currentThread.setName("New Thread");
		System.out.println(currentThread.getName());
		System.out.println(currentThread.getState());
		System.out.println(t1.getState());
	}
}