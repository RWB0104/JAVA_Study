class Person
{
	private int perID;
	private int milID;
	private int birthYear;
	private int birthMonth;
	private int birthDay;
	
	public Person(int perID, int milID, int bYear, int bMonth, int bDay)
	{
		this.perID = perID;
		this.milID = milID;
		this.birthYear = bYear;
		this.birthMonth = bMonth;
		this.birthDay = bDay;
	}
	
	public Person(int pID, int bYear, int bMonth, int bDay)
	{
		this(pID, 0, bYear, bMonth, bDay);
	}

	public void showInfo()
	{
		System.out.println("�ι� : " + perID);
		System.out.println("������� : " + birthYear + "/" + birthMonth + "/" + birthDay);
		
		if(milID != 0)
			System.out.println("���� : " + milID + "\n");
		else
			System.out.println("���� ���� ����\n");
	}
}

class CstOverloading
{
	public static void main(String[] args)
	{
		Person man = new Person(951203, 880102, 1995, 12, 3);
		Person woman = new Person(991107, 1999, 11, 7);
		man.showInfo();
		woman.showInfo();
	}
}