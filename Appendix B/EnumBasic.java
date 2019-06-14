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
				System.out.println("남자 손님입니다.");
				break;
				
			case WOMAN :
				System.out.println("여성 손님입니다.");
				break;
				
			case BABY :
				System.out.println("아기 손님입니다.");
				break;
		}
	}
}