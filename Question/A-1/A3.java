import java.util.Scanner;

class A3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("2진수 두 개를 가지고 표현할 수 있는 데이터의 수는 00, 010, 10, 11 이렇게 총 4개이다.");
		System.out.println("그렇다면 2진수 N개를 가지고 표현할 수 있는 데이터의 수는 총 몇 개인가?");
		System.out.println();
		System.out.print("정답 >> ");
		String ans = sc.nextLine();
		
		System.out.println();
		System.out.println("정답 : 2의 n승 만큼 표현할 수 있다.");
		System.out.println("Ex) 2진수 4개는 0000 ~ 1111까지 총 16개 표현 가능");
	}
}