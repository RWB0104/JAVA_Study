import java.util.Scanner;

class A1
{
	public static void main(String[] args)
	{
		boolean question = true;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. �����ϰ� �Ǵ� �������� ���� ���� �����ϸ�,");
		System.out.println("����� �������� ������ �Ͼ�� ��Ȳ����");
		System.out.println("�����ϰ� ����� �� �ִ� �÷��� Ŭ������ �����ΰ�?");
		System.out.println("");
		System.out.println("1. ArrayList<E>");
		System.out.println("2. LinkedList<E>");
		System.out.println("");
		
		while (question)
		{
			System.out.print("���� >> ");
			int result1 = sc.nextInt();
			
			System.out.println("");
			
			switch (result1)
			{
			case 1 :
				System.out.println("����!");
				System.out.println("");
				question = false;
				break;
				
			case 2 :
				System.out.println("����.");
				System.out.println("");
				break;

			default :
				System.out.println("�ùٸ� ������ �Է��ϼ���. (1 or 2)");
				System.out.println("");
				break;
			}
		}
		
		question = true;
		
		System.out.println("2. �����ϰ� �Ǵ� �������� ���� ���� �Ұ����ϸ�,");
		System.out.println("����� �������� ���� �� ������ �Ͼ�� ��Ȳ����");
		System.out.println("�����ϰ� ����� �� �ִ� �÷��� Ŭ������ �����ΰ�?");
		System.out.println("");
		System.out.println("1. ArrayList<E>");
		System.out.println("2. LinkedList<E>");
		System.out.println("");
		
		while (question)
		{
			System.out.print("���� >> ");
			int result1 = sc.nextInt();
			
			System.out.println("");
			
			switch (result1)
			{
			case 1 :
				System.out.println("����!");
				System.out.println("");
				question = false;
				break;
				
			case 2 :
				System.out.println("����.");
				System.out.println("");
				break;

			default :
				System.out.println("�ùٸ� ������ �Է��ϼ���. (1 or 2)");
				System.out.println("");
				break;
			}
		}
		
		System.out.println("��!");
	}
}