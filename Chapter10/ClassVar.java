class ClassVar
{
	public static void main(String[] args)
	{
		InstCnt cnt1 = new InstCnt();
		InstCnt cnt2 = new InstCnt();
		InstCnt cnt3 = new InstCnt();
	}
}

class InstCnt
{
	static int instNum = 0;
	
	public InstCnt()
	{
		instNum++;
		System.out.println("Instance Create : " + instNum);
	}
}