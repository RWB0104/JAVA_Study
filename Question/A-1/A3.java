import java.util.Scanner;

class A3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("2���� �� ���� ������ ǥ���� �� �ִ� �������� ���� 00, 010, 10, 11 �̷��� �� 4���̴�.");
		System.out.println("�׷��ٸ� 2���� N���� ������ ǥ���� �� �ִ� �������� ���� �� �� ���ΰ�?");
		System.out.println();
		System.out.print("���� >> ");
		String ans = sc.nextLine();
		
		System.out.println();
		System.out.println("���� : 2�� n�� ��ŭ ǥ���� �� �ִ�.");
		System.out.println("Ex) 2���� 4���� 0000 ~ 1111���� �� 16�� ǥ�� ����");
	}
}