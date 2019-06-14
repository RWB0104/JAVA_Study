class A2
{
	public static void main(String[] args)
	{
		int i=285;
		int j=12;
		
		F(i, j);
	}
	
	public static void F(int i, int j)
	{
		if(i>j)
			System.out.println(i + " - " + j + " = " + (i-j));
		else
			System.out.println(j + " - " + i + " = " + (j-i));
	}
}