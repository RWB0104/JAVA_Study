import java.io.File;

class A1
{
	public static void showDirList(File[] list)
	{
		for (int i = 0; i < list.length; i++)
		{
			System.out.print(list[i].getName());
			if (list[i].isDirectory())
				System.out.println("\t \t DIR");
			
			else
				System.out.println("\t \t FILE");
		}
	}
	
	public static void main(String[] args)
	{
		String workingDir = System.getProperty("user.dir");
		System.out.println(workingDir);
		
		File currentDir = new File(workingDir);
		System.out.println("���� ���͸� : " + currentDir.getName());
		showDirList(currentDir.listFiles());
		
		File upperDir = currentDir.getParentFile();
		System.out.println("���� ���͸� : " + upperDir.getName());
		showDirList(upperDir.listFiles());
	}
}