import java.io.*;

class DataFilterStream
{
	public static void main(String[] args) throws IOException
	{
		OutputStream out = new FileOutputStream("D:\\NaverCloud\\KSIC\\JAVA Study\\Chapter24\\data.bin");
		DataOutputStream filterOut = new DataOutputStream(out);
		filterOut.writeInt(275);
		filterOut.writeDouble(45.79);
		filterOut.close();
		
		InputStream in = new FileInputStream("D:\\NaverCloud\\KSIC\\JAVA Study\\Chapter24\\data.bin");
		DataInputStream filterIn = new DataInputStream(in);
		
		int num1 = filterIn.readInt();
		double num2 = filterIn.readDouble();
		
		filterIn.close();
		
		System.out.println(num1);
		System.out.println(num2);
	}
}