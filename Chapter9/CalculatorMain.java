//import orange.cal.Calculator;

class CalculatorMain
{
	public static void main(String[] args)
	{
		Calculator cal=new Calculator();
		System.out.println("1+2 = " + cal.addTwoNumber(1, 2));
		System.out.println("2+4 = " + cal.addTwoNumber(2, 4));
		System.out.println("5-1 = " + cal.subTwoNumber(5, 1));
		cal.showOperatingTimes();
	}
}

//package orange.cal;

public class Calculator
{
	private Adder adder;
	private Subtractor subtractor;
	
	public Calculator()
	{
		adder=new Adder();
		subtractor=new Subtractor();
	}
	
	public int addTwoNumber(int num1, int num2)
	{
		return adder.addTwoNumber(num1, num2);
	}
	
	public int subTwoNumber(int num1, int num2)
	{
		return subtractor.subTwoNumber(num1, num2);
	}
	
	public void showOperatingTimes()
	{
		System.out.println("Add Num : " + adder.getCntAdd());
		System.out.println("Subtract Num : " + subtractor.getCntSub());
	}
}

class Adder
{
	private int cntAdd;
	
	Adder() { cntAdd=0; }
	int getCntAdd() { return cntAdd; }
	int addTwoNumber(int num1, int num2)
	{
		cntAdd++;
		return num1+num2;
	}
}

class Subtractor
{
	private int cntSub;
	
	Subtractor() { cntSub=0; }
	int getCntSub() {return cntSub; }
	int subTwoNumber(int num1, int num2)
	{
		cntSub++;
		return num1-num2;
	}
}