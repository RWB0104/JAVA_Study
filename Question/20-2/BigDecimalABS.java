import java.util.*;
import java.math.*;

class BigDecimalABS
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("�Ǽ� 1 �Է� : ");
		String val1 = sc.nextLine();
		
		System.out.print("�Ǽ� 2 �Է� : ");
		String val2 = sc.nextLine();
		
		BigDecimal e1 = new BigDecimal(val1);
		BigDecimal e2 = new BigDecimal(val2);
		
		BigDecimal subResult = e1.subtract(e2);
		
		System.out.println("�� �Ǽ��� ���� ���� ���밪 : " + subResult.abs());
	}
}