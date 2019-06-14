import java.io.*;

class A1
{
	public static void main(String[] args) throws IOException
	{
		BufferedWriter bout = new BufferedWriter(new FileWriter("printf.txt"));
		PrintWriter out = new PrintWriter(bout);
		
		out.printf("제 나이는 %d살 입니다.", 24);
		out.println("");
		
		out.println("저는 자바가 좋습니다.");
		out.print("특히 I/O 부분에서 많은 매력을 느낍니다.");
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