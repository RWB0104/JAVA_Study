import java.io.*;

class A1
{
	public static void main(String[] args) throws IOException
	{
		RandomAccessFile raf = new RandomAccessFile("data.bin", "r");
		
		raf.seek(raf.length() - 8);
		System.out.println(raf.readDouble());
		
		raf.close();
	}
}