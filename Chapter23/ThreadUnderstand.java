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
			System.out.println("�ȳ��ϼ���. " + threadName + "�Դϴ�.");
			
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
		showThread st1 = new showThread("���� ������");
		showThread st2 = new showThread("���� ������");
		
		st1.start();
		st2.start();
	}
}