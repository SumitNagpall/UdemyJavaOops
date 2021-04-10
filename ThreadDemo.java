class ThreadDemo extends Thread
{
	String name="Sumit";
	String course = "MCA";
	public static void main()
	{
		System.out.praintln("Inside main");
	}
	public static void main(String[] args)
	{
		ThreadDemo t1 = new ThreadDemo()
		{
			public void run()
			{
				synchronized(name)
				{
					System.out.println("T1 Hello "+name);
				
					try
					{
						Thread.sleep(1000);
					}
					catch(Exception e)
					{
						System.out.println(e.getMessage());
					}
					synchronized(course)
					{
						System.out.println("T1 Great you are doing "+course);			
					}
				}
			}
		};
		ThreadDemo t2 = new ThreadDemo()
		{
			public void run()
			{
				synchronized(course)
				{
					System.out.println("T2 Great you are doing "+course);
				
					try
					{
						Thread.sleep(1000);
					}
					catch(Exception e)
					{
						System.out.println(e.getMessage());
					}
					synchronized(name)
					{
						System.out.println("T2 Welcome "+name);			
					}
				}
			}
		};
		t1.start();
		t2.start();
	}
}	
