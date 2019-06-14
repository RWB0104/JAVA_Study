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
		System.out.println(objName + "이 소멸되었습니다.");
	}
}

class ObjectFinalize
{
	public static void main(String[] args)
	{
		myName obj1 = new myName("인스턴스1");
		myName obj2 = new myName("인스턴스2");
		obj1 = null;
		obj2 = null;
		
		System.out.println("프로그램을 종료합니다.");
	}
}