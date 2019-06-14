class RightRecul
{
	public static void main(String[] args)
	{
		showHi(3);
	}
	
	public static void showHi(int cnt)
	{
		System.out.println("Hawi^^");
		
		if(cnt==1)
			return;
		
		showHi(--cnt);
	}
}