import java.io.*;

public class StringWriter
{
	public static void main(String[] args) throws IOException
	{
		BufferedWriter out = new BufferedWriter(new FileWriter("String.txt"));
		
		out.write("������ - �޽� ���߰� �ϴµ� �����ϰڴ�.");
		out.newLine();
		out.write("�� ������ ������ �־� �ְ��� �����̴�.");
		out.newLine();
		out.write("���� �¸��ϴ� ���� ���� ���� �ּ��� ���ϰڴ�.");
		out.newLine();
		out.write("ȯ������ ������� �� ���̴�.");
		out.newLine();
		out.newLine();
		out.write("��� ���� �� �����ڷ�");
		out.newLine();
		out.write("press@goodnews.com");
		out.close();
		
		System.out.println("��� �Է� �Ϸ�.");
	}
}