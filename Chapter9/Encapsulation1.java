class Encapsulation1
{
	public static void main(String[] args)
	{
		ColdPatient sufferer = new ColdPatient();
		sufferer.takeSinivelCap(new SinivelCap());
		sufferer.takeSneezeCap(new SneezeCap());
		sufferer.takeSnuffleCap(new SnuffleCap());
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
	public void takeSinivelCap(SinivelCap cap){cap.take();}
	public void takeSneezeCap(SneezeCap cap){cap.take();}
	public void takeSnuffleCap(SnuffleCap cap){cap.take();}
}