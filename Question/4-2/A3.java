class A3
{
	public static void main(String[] args)
	{
		int num=7;
		int bit=2<<29;
		num|=bit;
		
		System.out.println(bit);
		System.out.println(bit<<=1);
		
		num=-12;
		bit=~0;
		bit^=(1<<30);
		num&=bit;
		System.out.println(bit);
		System.out.println(bit<<=1);
	}
}