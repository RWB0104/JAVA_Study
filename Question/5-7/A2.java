class A2
{
	public static void main(String[] args)
	{
		int j=9;
		
		for(int i=0; i<10; i++)
		{
			System.out.println((i*10 + j) + " + " +(j*10 + i)+ " = " + ((i*10 + j) + (j*10 + i)));
			j--;
		}
	}
}