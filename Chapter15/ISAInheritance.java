class Computer
{
	String owner;
	 public Computer(String name) { owner = name; }
	 public void calculate() { System.out.println("��û ������ ����մϴ�."); }
}

class NotebookComp extends Computer
{
	int battery;
	
	public NotebookComp(String name, int initChag)
	{
		super(name);
		battery = initChag;
	}
	
	public void charging() { battery += 5; }
	
	public void movingCal()
	{
		if(battery < 1)
		{
			System.out.println("������ �ʿ��մϴ�.");
			return;
		}
		
		System.out.print("�̵��ϸ鼭 ");
		calculate();
		battery -= 1;
	}
}

class TabletNotebook extends NotebookComp
{
	String regstPenModel;
	
	public TabletNotebook(String name, int initChag, String pen)
	{
		super(name, initChag);
		regstPenModel = pen;
	}
	
	public void write(String penInfo)
	{
		if(battery < 1)
		{
			System.out.println("������ �ʿ��մϴ�.");
			return;
		}
		
		if(regstPenModel.compareTo(penInfo) != 0)
		{
			System.out.println("��ϵ� ���� �ƴմϴ�.");
			return;
		}
		
		System.out.println("�ʱ� ������ ó���մϴ�.");
		battery -= 1;
	}
}

class ISAInheritance
{
	public static void main(String[] args)
	{
		NotebookComp nc = new NotebookComp("�̼���", 5);
		TabletNotebook tn = new TabletNotebook("������", 5, "ISE-241-242");
		
		nc.movingCal();
		tn.write("ISE-241-242");
	}

}
