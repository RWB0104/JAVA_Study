class A2
{
	public static void main(String[] args)
	{
		int num=200;
		
		if(num>=300)
			System.out.println("num>=300");
		if(num<300 && num>=200)
			System.out.println("200<=num<300");
		if(num<200 && num>=100)
			System.out.println("100<=num<200");
		if(num<100 && num>=0)
			System.out.println("0<=num<100");
		if(num<0)
			System.out.println("num<0");
	}
}