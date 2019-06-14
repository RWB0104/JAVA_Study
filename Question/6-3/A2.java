class A2
{
	public static void main(String[] args)
	{
		toBinaty(10);
	}
	
	public static int toBinaty(int n)
	{
		if(n>0)
		{
			int bin;
			bin=n%2;
			n/=2;
			toBinaty(n);
			
			System.out.println(bin);
		}
		
		return 0;
	}
}