import java.util.Random;

class UseMathRandom
{
	public static void main(String[] args)
	{
		int randVal;
		
		for (int i = 0; i < 5; i++)
		{
			randVal = (int)(Math.random() * 10);
			System.out.println(randVal);
		}
	}
}