class A3
{
	public static void main(String[] args)
	{
		int num=0;
		int count=0;
		
		while(num<=1000)
		{
			if((num%2==0) || (num%7==0))
			{
				System.out.println(num);
				count+=num;
			}
			num++;
		}
		System.out.println(count);
	}
}