import java.io.*;

class MyInfo
{
	String info;
	
	public MyInfo(String info) { this.info = info; }
	public String toString() { return info; }
}

class A1
{
	public static void main(String[] args) throws IOException
	{
		OutputStream out = new FileOutputStream("println.txt");
		PrintStream pntOut = new PrintStream(out);
		
		MyInfo mInfo = new MyInfo("���� �ڹ� ���α׷����Դϴ�.");
		
		pntOut.println("�� �Ұ��� �ϰڽ��ϴ�.");
		pntOut.println(mInfo);
		pntOut.printf("���� %d, ������ %dkg�Դϴ�.", 24, 72);
		pntOut.close();
	}
}