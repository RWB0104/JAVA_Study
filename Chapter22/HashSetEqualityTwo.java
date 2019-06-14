import java.util.Iterator;
import java.util.HashSet;

class SimpleNumer
{
	int num;
	
	public SimpleNumer(int n)
	{
		num = n;
	}
	
	public String toString()
	{
		return String.valueOf(num);
	}
	
	public int hashCode()
	{
		return num % 3;
	}
	
	public boolean equals(Object obj)
	{
		SimpleNumer comp = (SimpleNumer)obj;
		
		if (comp.num == num)
			return true;
		
		else {
			return false;
		}
	}
}

class HashSetEqualityTwo
{
	public static void main(String[] args)
	{
		HashSet<SimpleNumer> hSet = new HashSet<SimpleNumer>();
		hSet.add(new SimpleNumer(10));
		hSet.add(new SimpleNumer(20));
		hSet.add(new SimpleNumer(20));
		
		System.out.println("저장된 데이터 수 : " + hSet.size());
		
		Iterator<SimpleNumer> itr = hSet.iterator();
		
		while (itr.hasNext())
			System.out.println(itr.next());
	}
}