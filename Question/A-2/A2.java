import java.util.Scanner;

class A2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		while (true)
		{
			System.out.println("16����");
			System.out.println("AD");
			System.out.println();
			System.out.println("2���� ��ȯ");
			System.out.print("���� >> ");
			int ans = sc.nextInt();
			sc.nextLine();
			
			if (ans == 10101101)
			{
				System.out.println();
				System.out.println("����");
				System.out.println();
				break;
			}
			
			else
			{
				System.out.println();
				System.err.println("����");
				System.out.println();
			}
		}
		
		while (true)
		{
			System.out.println("16����");
			System.out.println("12DE");
			System.out.println();
			System.out.println("2���� ��ȯ");
			System.out.print("���� >> ");
			String ans = sc.nextLine();
			
			if (ans.equals("0001001011011110"))
			{
				System.out.println();
				System.out.println("����");
				System.out.println();
				break;
			}
			
			else
			{
				System.out.println();
				System.err.println("����");
				System.out.println();
			}
		}
		
		while (true)
		{
			System.out.println("16����");
			System.out.println("DA10BF");
			System.out.println();
			System.out.println("2���� ��ȯ");
			System.out.print("���� >> ");
			String ans = sc.nextLine();
			
			if (ans.equals("110110100001000010111111"))
			{
				System.out.println();
				System.out.println("����");
				System.out.println();
				break;
			}
			
			else
			{
				System.out.println();
				System.err.println("����");
				System.out.println();
			}
		}
	}
}