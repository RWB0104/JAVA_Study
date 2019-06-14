class A1
{
	public static void main(String[] args)
	{
		int num1=10, num2=20, num3=30;
		num1=num2=num3;
		
		System.out.println("num1=" + num1 + " , num2=" + num2 + " , num3=" + num3);
	}
}

// "=" 연산자는 진행방향이 ← 이므로 num3의 값이 num2에 저장된다. num2의 값은 num1에 저장되므로,
// num3의 값이 순차적으로 num2, num1에 저장된다.