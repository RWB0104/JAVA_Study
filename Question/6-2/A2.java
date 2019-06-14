class A2
{
	public static void main(String[] args)
	{
		for(int i=1; i<=100; i++)
		{
			if(pm(i))
				System.out.println(i + " is Prime Number");
		}
	}
	
	public static boolean pm(int n)
	{
		if(n==1)
			return false;
		
		for(int i=2; i<n; i++)
		{
			if(n%i==0)
				return false;
		}
		
		return true;
	}
}