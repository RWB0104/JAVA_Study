import java.io.*;

class Circle implements Serializable
{
	int xPos;
	int yPos;
	double rad;
	
	public Circle(int x, int y, double r)
	{
		xPos = x;
		yPos = y;
		rad = r;
	}
	
	public void showCircleInfo()
	{
		System.out.printf("[%d, %d] \n", xPos, yPos);
		System.out.println("rad : " + rad);
	}
}

class ObjectSerializable
{
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Object.ser"));
		
		out.writeObject(new Circle(1, 1, 2.4));
		out.writeObject(new Circle(2, 2, 4.8));
		out.writeObject(new String("String implements Serializable"));
		
		out.close();
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("Object.ser"));
		
		Circle cl1 = (Circle)in.readObject();
		Circle cl2 = (Circle)in.readObject();
		String message = (String)in.readObject();
		in.close();
		
		cl1.showCircleInfo();
		cl2.showCircleInfo();
		
		System.out.println(message);
	}
}