class A2
{
	public static void main(String[] args)
	{
		int num=1;
		int count=0;
		
		while(true)
		{
			if(num%2==1 || (num%3==0 && num%2==0))
			{
				count+=num;
				System.out.println(num);
			}
			
			if(count>1000)
			{
				System.out.println("Over the 1000 when add " + num);
				System.out.println("Total : " + count);
				break;
			}
			num++;
		}
	}
}