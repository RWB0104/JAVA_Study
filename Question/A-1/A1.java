class A1
{
	public static void main(String[] args)
	{
		int[] dec = {8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		int[] bit = {1000, 1001, 1010, 1011, 1100, 1101, 1110, 1111, 10000, 10001, 10010, 10011, 10100};
		String[] hex = {"8", "9", "A", "B", "C", "D", "E", "F", "10", "11", "12", "13", "14"};
		
		System.out.println("10진수");
		
		for (int string : dec)
			System.out.print(string + " ");
		
		System.out.println();
		System.out.println();
		System.out.println("2진수");
		
		for (int string : bit)
			System.out.print(string + " ");
		
		System.out.println();
		System.out.println();
		System.out.println("16진수");
		
		for (String string : hex)
			System.out.print(string + " ");
	}
}
