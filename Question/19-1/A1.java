class Point
{
	int xPos, yPos;
	
	public Point(int x, int y)
	{
		xPos = x;
		yPos = y;
	}
	
	public void showPosition()
	{
		System.out.printf("[%d, %d]", xPos, yPos);
	}
	
	public boolean equals(Object obj)
	{
		Point cmp = (Point)obj;
		
		if(xPos == cmp.xPos && yPos == cmp.yPos)
			return true;
		
		else
			return false;
	}
}

class Rectangle
{
	Point upperLeft, lowerRight;
	
	public Rectangle(int x1, int y1, int x2, int y2)
	{
		upperLeft = new Point(x1, y1);
		lowerRight = new Point(x2, y2);
	}
	
	public void showPosition()
	{
		System.out.println("���簢���� ��ġ����...");
		System.out.println("�� ��� : ");
		upperLeft.showPosition();
		
		System.out.println("");
		
		System.out.println("�� �ϴ�");
		lowerRight.showPosition();
		
		System.out.println("\n");
	}
	
	public boolean equals(Object obj)
	{
		Rectangle cmp = (Rectangle)obj;
		
		if(upperLeft.equals(cmp.upperLeft) && lowerRight.equals(cmp.lowerRight))
			return true;
		
		else
			return false;
	}
}

class A1
{
	public static void main(String[] args)
	{
		Rectangle rec1 = new Rectangle(1, 2, 8, 9);
		Rectangle rec2 = new Rectangle(2, 3, 5, 5);
		Rectangle rec3 = new Rectangle(1, 2, 8, 9);
		
		rec1.showPosition();
		rec2.showPosition();
		rec3.showPosition();
		
		if(rec1.equals(rec2))
			System.out.println("rec1�� rec2�� ��ġ ������ ����.");
		
		else
			System.out.println("rec1�� rec2�� ��ġ ������ �ٸ���.");
		
		if(rec1.equals(rec3))
			System.out.println("rec1�� rec3�� ��ġ ������ ����.");
		
		else
			System.out.println("rec1�� rec3�� ��ġ ������ �ٸ���.");
	}
}