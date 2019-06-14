import java.util.Scanner;

class A2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		while (true)
		{
			System.out.println("16진수");
			System.out.println("AD");
			System.out.println();
			System.out.println("2진수 변환");
			System.out.print("정답 >> ");
			int ans = sc.nextInt();
			sc.nextLine();
			
			if (ans == 10101101)
			{
				System.out.println();
				System.out.println("정답");
				System.out.println();
				break;
			}
			
			else
			{
				System.out.println();
				System.err.println("오답");
				System.out.println();
			}
		}
		
		while (true)
		{
			System.out.println("16진수");
			System.out.println("12DE");
			System.out.println();
			System.out.println("2진수 변환");
			System.out.print("정답 >> ");
			String ans = sc.nextLine();
			
			if (ans.equals("0001001011011110"))
			{
				System.out.println();
				System.out.println("정답");
				System.out.println();
				break;
			}
			
			else
			{
				System.out.println();
				System.err.println("오답");
				System.out.println();
			}
		}
		
		while (true)
		{
			System.out.println("16진수");
			System.out.println("DA10BF");
			System.out.println();
			System.out.println("2진수 변환");
			System.out.print("정답 >> ");
			String ans = sc.nextLine();
			
			if (ans.equals("110110100001000010111111"))
			{
				System.out.println();
				System.out.println("정답");
				System.out.println();
				break;
			}
			
			else
			{
				System.out.println();
				System.err.println("오답");
				System.out.println();
			}
		}
	}
}