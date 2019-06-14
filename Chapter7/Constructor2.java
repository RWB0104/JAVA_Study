class Constructor2
{
	public static void main(String[] args)
	{
		Number num1=new Number(10);
		System.out.println(num1.getNumber());
		
		Number num2=new Number(20);
		System.out.println(num2.getNumber());
	}
}

class Number
{
	int num;
	
	public Number(int n)
	{
		num=n;
		System.out.println("Constructor Call");
	}
	
	public int getNumber()
	{
		return num;
	}
}