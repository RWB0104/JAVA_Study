import java.util.ArrayList;

class A1
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		
		System.out.println("ArrayList�� ũ�� : " + list.size());
		
		for (int i = 0; i < list.size(); i++)
			System.out.println("list�� " + i + "�� ° �� : " + list.get(i));
		
		list.ensureCapacity(500);;
		
		System.out.println("ArrayList�� ũ�� : " + list.size());
		
		for (int i = 0; i < list.size(); i++)
			System.out.println("list�� " + i + "�� ° �� : " + list.get(i));
		
		list.ensureCapacity(list.size() * 2);
		
		System.out.println("ArrayList�� ũ�� : " + list.size());
		
		for (int i = 0; i < list.size(); i++)
			System.out.println("list�� " + i + "�� ° �� : " + list.get(i));
	}
}