import java.math.*;
import java.util.Scanner;

class A1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		BigDecimal e1 = sc.nextBigDecimal();
		
		System.out.print("���� �Է� : ");
		BigDecimal e2 = sc.nextBigDecimal();
		
		System.out.println("�� �Ǽ��� ������ ���밪 : " + e1.subtract(e2).abs());
	}
}