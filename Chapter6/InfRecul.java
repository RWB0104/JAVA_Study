class InfRecul
{
	public static void main(String[] args)
	{
		showHi(3);
	}
	
	public static void showHi(int cnt)
	{
		System.out.println("Hawi^^");
		showHi(cnt--);
		
		if(cnt==1)
			return;
	}
}