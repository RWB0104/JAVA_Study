class ClassVarUse
{
	public static void main(String[] args)
	{
		Circle cl = new Circle(1.2);
		cl.ShowPerimeter();
		cl.ShowArea();
	}
}

class Circle
{
	static final double PI = 3.1415;
	private double radius;
	
	public Circle(double rad) { radius = rad; }
	public void ShowPerimeter()
	{
		double peri = (radius*2) * PI;
		System.out.println("Perimeter = " + peri);
	}
	
	public void ShowArea()
	{
		double area = (radius*radius) * PI;
		System.out.println("Area = " + area);
	}
}