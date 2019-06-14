import java.util.Scanner;

class A1
{
	public static void addOneDArr(int[] arr, int add)
	{
		for(int i = 0; i < arr.length; i++)
			arr[i] += add;
	}
	
	public static void addTwoDArr(int[][] arr, int add)
	{
		for(int i = 0; i < arr.length; i++)
			addOneDArr(arr[i], add);
	}
	
	public static void main(String[] args)
	{
	
		int a, b, c, d;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 행 : ");
		a = sc.nextInt();
		System.out.print("배열의 열 : ");
		b = sc.nextInt();
		System.out.print("배열의 요소 : ");
		c = sc.nextInt();
		System.out.println("배열 요소에 더할 값");
		d = sc.nextInt();
		
		int[][] arr = new int[a][b];
		
		for(int i = 0; i < arr.length; i++)
			for(int j = 0; j < arr[i].length; j++)
				arr[i][j] = c;
		
		addTwoDArr(arr, d);
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
				System.out.print(arr[i][j] + " ");
			
			System.out.println("");
		}
		
	}

}
