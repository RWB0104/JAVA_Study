import java.util.Iterator;
import java.util.HashMap;
import java.util.HashSet;

class UsefulInterator
{
	public static void main(String[] args)
	{
		HashSet<String> set = new HashSet<String>();
		set.add("First");
		set.add("Second");
		set.add("Third");
		set.add("Fourth");
		
		Iterator<String> itr = set.iterator();
		
		System.out.println("반복자를 이용한 1차 출력과 \"Third\" 삭제");
		
		while (itr.hasNext())
		{
			String curstr = itr.next();
			System.out.println(curstr);
			
			if (curstr.compareTo("Third") == 0)
				itr.remove();
		}
		
		System.out.println("\n\"Third\" 삭제 후 반복자를 이용한 2차 출력 ");
		itr = set.iterator();
		
		while (itr.hasNext())
			System.out.println(itr.next());
	}
}