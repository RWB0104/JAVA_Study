class MarblesMain
{
	public static void main(String[] args)
	{
		ChildProperty child1=new ChildProperty(15);
		ChildProperty child2=new ChildProperty(9);
		
		System.out.println("Beads Number Before Game");
		System.out.println();
		System.out.println("Child 1");
		child1.showProperty();
		System.out.println();
		System.out.println("Child 2");
		child2.showProperty();
		System.out.println();
		
		child1.obtainBead(child2, 2);
		child2.obtainBead(child1, 7);
		
		System.out.println();
		System.out.println("Beads Number After Game");
		System.out.println();
		System.out.println("Child 1");
		child1.showProperty();
		System.out.println();
		System.out.println("Child 2");
		child2.showProperty();
		System.out.println();
	}
}

class ChildProperty
{
	int numOfBead;
	
	public ChildProperty(int bead)
	{
		numOfBead=bead;
	}
	
	public void obtainBead(ChildProperty child, int obtainCount)
	{
		int obtainBeadCount=child.loseBead(obtainCount);
		numOfBead+=obtainBeadCount;
	}
	
	public int loseBead(int loseCount)
	{
		if(numOfBead<loseCount)
		{
			int retValue=numOfBead;
			numOfBead=0;
			return retValue;
		}
		
		numOfBead-=loseCount;
		return loseCount;
	}
	
	public void showProperty()
	{
		System.out.println("Have Beads : " + numOfBead);
	}
}