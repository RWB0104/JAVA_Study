class Encapsulation2
{
	public static void main(String[] args)
	{
		ColdPatient sufferer=new ColdPatient();
		sufferer.takeCONTAC600(new CONTAC600());
	}
}

class CONTAC600
{
	SinivelCap sin;
	SneezeCap sne;
	SnuffleCap snu;
	
	public CONTAC600()
	{
		sin=new SinivelCap();
		sne=new SneezeCap();
		snu=new SnuffleCap();
	}
	
	public void take()
	{
		sin.take();
		sne.take();
		snu.take();
	}
}

class SinivelCap
{
	public void take(){System.out.println("Cure Sick");}
}

class SneezeCap
{
	public void take(){System.out.println("Cure Sneeze");}
}

class SnuffleCap
{
	public void take(){System.out.println("Cure Snuffle");}
}

class ColdPatient
{
	public void takeCONTAC600(CONTAC600 cap){cap.take();}
}