enum Animal
{
	DOG, CAT, BEAR;
}

enum Person
{
	MAN, WOMAN, BABY;
}

class EnumBasic
{
	public static void main(String[] args)
	{
		whoAreYou(Person.MAN);
		Person myFriendPerson = Person.WOMAN;
	}
	
	public static void whoAreYou(Person man)
	{
		switch (man)
		{
			case MAN :
				System.out.println("���� �մ��Դϴ�.");
				break;
				
			case WOMAN :
				System.out.println("���� �մ��Դϴ�.");
				break;
				
			case BABY :
				System.out.println("�Ʊ� �մ��Դϴ�.");
				break;
		}
	}
}