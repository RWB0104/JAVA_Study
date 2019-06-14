import java.io.*;

class A1
{
	public static void main(String[] args) throws IOException
	{
		BufferedWriter bout = new BufferedWriter(new FileWriter("printf.txt"));
		PrintWriter out = new PrintWriter(bout);
		
		out.printf("�� ���̴� %d�� �Դϴ�.", 24);
		out.println("");
		
		out.println("���� �ڹٰ� �����ϴ�.");
		out.print("Ư�� I/O �κп��� ���� �ŷ��� �����ϴ�.");
		out.close();
		
		BufferedReader bin = new BufferedReader(new FileReader("printf.txt"));
		
		String str;
		
		while (true)
		{
			str = bin.readLine();
			
			if (str == null)
				break;
				
			System.out.println(str);
		}
		
		bin.close();
	}
}