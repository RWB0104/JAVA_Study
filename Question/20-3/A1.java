import java.util.Scanner;
import java.util.Random;

class A1
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("�ִ� : ");
		int max = keyboard.nextInt();
		
		System.out.print("�ּ� : ");
		int min = keyboard.nextInt();
		
		Random rand = new Random();
		
		int randVal;
		
		for (int i = 0; i < 10; i++)
		{
			randVal = rand.nextInt(max - min + 1);
			randVal += min;
			System.out.println(randVal);
		}
	}
}