import java.util.Scanner;

class A1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		while (true)
		{
			System.out.println("2진수");
			System.out.println("110000101001");
			System.out.println();
			System.out.println("16진수 변환");
			System.out.print("정답 >> ");
			String ans = sc.nextLine();
			
			if (ans.equals("A29") || ans.equals("a29"))
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
		
		System.out.println();
		System.out.println();
		
		while (true)
		{
			System.out.println("2진수");
			System.out.println("100111000101");
			System.out.println();
			System.out.println("16진수 변환");
			System.out.print("정답 >> ");
			String ans = sc.nextLine();
			
			if (ans.equals("9A5") || ans.equals("9a5"))
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