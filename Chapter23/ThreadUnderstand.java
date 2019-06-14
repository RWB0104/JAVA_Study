class showThread extends Thread
{
	String threadName;
	
	public showThread(String name)
	{
		threadName = name;
	}
	
	public void run()
	{
		for (int i = 0; i < 100; i++)
		{
			System.out.println("안녕하세요. " + threadName + "입니다.");
			
			try
			{
				sleep(100);
			}
			
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		} 
	}
}

class ThreadUnderstand
{
	public static void main(String[] args)
	{
		showThread st1 = new showThread("멋진 쓰레드");
		showThread st2 = new showThread("예쁜 쓰레드");
		
		st1.start();
		st2.start();
	}
}