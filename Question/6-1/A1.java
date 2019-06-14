class A1
{
	public static void main(String[] args)
	{
		int i=30;
		int j=15;
		
		F1(i, j);
		F2(i, j);
		F3(i, j);
		F4(i, j);
	}
		
	public static void F1(int i, int j)
	{
		System.out.println(i + " + " + j + " = " + (i+j));
	}
	
	public static void F2(int i, int j)
	{
		System.out.println(i + " - " + j + " = " + (i-j));
	}
	
	public static void F3(int i, int j)
	{
		System.out.println(i + " * " + j + " = " + (i*j));
	}
	
	public static void F4(int i, int j)
	{
		System.out.println(i + " / " + j + " = " + (i/j) + ", " + (i%j));
	}
}