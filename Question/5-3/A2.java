class A2
{
	public static void main(String[] args)
	{
		int n=-6;
		
		switch (n/10)
		{
			case 0 : System.out.println("-10<=num<10"); break;
			case 1 : System.out.println("10<=num<20"); break;
			case 2 : System.out.println("20<=num<30"); break;
			default : System.out.println("num<-10 or num>=30");
		}
	}
}