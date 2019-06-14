import java.util.Scanner;

class A1
{
	public static void main(String[] args)
	{
		boolean question = true;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 저장하게 되는 데이터의 수가 예측 가능하며,");
		System.out.println("빈번한 데이터의 참조가 일어나는 상황에서");
		System.out.println("유용하게 사용할 수 있는 컬랙션 클래스는 무엇인가?");
		System.out.println("");
		System.out.println("1. ArrayList<E>");
		System.out.println("2. LinkedList<E>");
		System.out.println("");
		
		while (question)
		{
			System.out.print("선택 >> ");
			int result1 = sc.nextInt();
			
			System.out.println("");
			
			switch (result1)
			{
			case 1 :
				System.out.println("정답!");
				System.out.println("");
				question = false;
				break;
				
			case 2 :
				System.out.println("오답.");
				System.out.println("");
				break;

			default :
				System.out.println("올바른 정답을 입력하세요. (1 or 2)");
				System.out.println("");
				break;
			}
		}
		
		question = true;
		
		System.out.println("2. 저장하게 되는 데이터의 수가 예측 불가능하며,");
		System.out.println("빈번한 데이터의 저장 및 삭제가 일어나는 상황에서");
		System.out.println("유용하게 사용할 수 있는 컬랙션 클래스는 무엇인가?");
		System.out.println("");
		System.out.println("1. ArrayList<E>");
		System.out.println("2. LinkedList<E>");
		System.out.println("");
		
		while (question)
		{
			System.out.print("선택 >> ");
			int result1 = sc.nextInt();
			
			System.out.println("");
			
			switch (result1)
			{
			case 1 :
				System.out.println("정답!");
				System.out.println("");
				question = false;
				break;
				
			case 2 :
				System.out.println("오답.");
				System.out.println("");
				break;

			default :
				System.out.println("올바른 정답을 입력하세요. (1 or 2)");
				System.out.println("");
				break;
			}
		}
		
		System.out.println("끝!");
	}
}