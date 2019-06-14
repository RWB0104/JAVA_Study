class SCE
{
	public static void main(String[] args)
	{
		int num1=0, num2=0;
		boolean result;
		
		result = (num1+=10)<0 && (num2+=10)>0;	// AND 연산자의 경우 첫 항이 false일 경우 나머지는 계산하지 않는다.
		System.out.println("result=" + result);
		System.out.println("num1=" + num1 + " , num2=" + num2);
		
		result=(num1+=10)>0 || (num2+=10)>0;	// OR 연산자의 경우 첫 항이 true일 경우 나머지는 계산하지 않는다.
		System.out.println("result=" + result);
		System.out.println("num1=" + num1 + " , num2=" + num2);
	}
}