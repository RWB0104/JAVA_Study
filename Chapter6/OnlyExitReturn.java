class OnlyExitReturn
{
	public static void main(String[] args)
	{
		divide(4, 2);
		divide(6, 2);
		divide(9,0);
	}
	
	public static void divide(int num1, int num2)
	{
		if(num2==0)
		{
			System.out.println("Can't divide 0");
			return;
		}
		
		System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
	}
}