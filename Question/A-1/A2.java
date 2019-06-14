class A2
{
	public static void main(String[] args)
	{
		int[] dec = {5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18};
		int[] oct = {5, 6, 7, 10, 11, 12, 13, 14, 15, 16, 17, 20, 21, 22};
		
		System.out.println("10진수");
		
		for (int string : dec)
			System.out.print(string + " ");
		
		System.out.println();
		System.out.println();
		System.out.println("8진수");
		
		for (int string : oct)
			System.out.print(string + " ");
	}
}