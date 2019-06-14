class MethodDefAdd
{
	public static void main(String[] args)
	{
		System.out.println("Program Begin");
		hiEveryone(12);
		hiEveryone(13);
		System.out.println("Program End");
	}
	
	public static void hiEveryone(int age)
	{
		System.out.println("Good Morning");
		System.out.println("I'm " + age + " years old");
	}
}