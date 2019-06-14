import java.math.*;
import java.util.Scanner;

class A1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		BigDecimal e1 = sc.nextBigDecimal();
		
		System.out.print("숫자 입력 : ");
		BigDecimal e2 = sc.nextBigDecimal();
		
		System.out.println("두 실수의 뺄셈의 절대값 : " + e1.subtract(e2).abs());
	}
}