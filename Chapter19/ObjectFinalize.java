class myName
{
	String objName;
	
	public myName(String name)
	{
		objName = name;
	}
	
	protected void finalize() throws Throwable
	{
		super.finalize();
		System.out.println(objName + "�� �Ҹ�Ǿ����ϴ�.");
	}
}

class ObjectFinalize
{
	public static void main(String[] args)
	{
		myName obj1 = new myName("�ν��Ͻ�1");
		myName obj2 = new myName("�ν��Ͻ�2");
		obj1 = null;
		obj2 = null;
		
		System.out.println("���α׷��� �����մϴ�.");
	}
}