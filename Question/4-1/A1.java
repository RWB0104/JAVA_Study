class A1
{
	public static void main(String[] args)
	{
		int num1=10, num2=20, num3=30;
		num1=num2=num3;
		
		System.out.println("num1=" + num1 + " , num2=" + num2 + " , num3=" + num3);
	}
}

// "=" �����ڴ� ��������� �� �̹Ƿ� num3�� ���� num2�� ����ȴ�. num2�� ���� num1�� ����ǹǷ�,
// num3�� ���� ���������� num2, num1�� ����ȴ�.