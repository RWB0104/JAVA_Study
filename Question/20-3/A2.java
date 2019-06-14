import java.util.Scanner;
import java.math.*;

public class A2
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("최대 : ");
		int max = keyboard.nextInt();
		
		System.out.print("최소 : ");
		int min = keyboard.nextInt();
		
		double randVal;
		
		for (int i = 0; i < 5; i++)
		{
			randVal = Math.random();
			randVal *= max;
			System.out.println(randVal);
		}
	}
}