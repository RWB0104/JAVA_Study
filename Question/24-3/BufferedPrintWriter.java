import java.io.*;

public class BufferedPrintWriter
{
	public static void main(String[] args) throws IOException
	{
		FileWriter out = new FileWriter("printf.txt");
		PrintWriter bufOut = new PrintWriter(new BufferedWriter(out));
		
		bufOut.printf("�� ���̴� %d�� �Դϴ�.", 24);
		bufOut.println("");
		
		bufOut.println("���� �ڹٰ� �����ϴ�.");
		bufOut.print("Ư�� I/O �κп��� ���� �ŷ��� �����ϴ�.");
		bufOut.close();
		
		String str;
		
		BufferedReader in = new BufferedReader(new FileReader("printf.txt"));
		
		while (true)
		{
			str = in.readLine();
			
			if (str == null)
				break;
			
			System.out.println(str);				
		}
		
		in.close();
	}
}
