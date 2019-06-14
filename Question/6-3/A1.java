class A1
{
	public static void main(String[] args)
	{
		System.out.println("2^5 : " + multi(5));
	}
	
	public static int multi(int n)
	{
		if(n==0)
			return 1;
		
		return multi(n-1)*2;
	}
}