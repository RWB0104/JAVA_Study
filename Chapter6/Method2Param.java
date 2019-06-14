class MethodDefAdd
{
	public static void main(String[] args)
	{
		double myHeight=175.9;
		hiEveryone(12, 12.5);
		hiEveryone(13, myHeight);
		biEveryone();
	}
	
	public static void hiEveryone(int age, double height)
	{
		System.out.println("I'm " + age + " years old");
		System.out.println("My height is " + height + "cm");
	}
	
	public static void biEveryone()
	{
		System.out.println("Bye Everyone");
	}
}