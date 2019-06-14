class A1
{
	public static void main(String[] args)
	{
		int r=5;
		
		double area=F1(r);
		double length=F2(r);
		System.out.println("Circle Area : " + area);
		System.out.println("Circle Length : " + length);
	}
	
	public static double F1(int r)
	{
		double result=r*r*3.141592;
		return(result);
	}
	
	public static double F2(int r)
	{
		double result=r*2*3.141592;
		return(result);
	}
}