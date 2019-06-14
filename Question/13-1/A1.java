import java.util.Scanner;

class A1
{
	public static int minValue(int[] arr)
	{
		int num = 0;
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] > num)
				num = arr[i];
		}
		
		return num;
	}
	
	public static int maxValue(int[] arr)
	{
		int num = 2147483647;
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] < num)
				num = arr[i];
		}
		
		return num;
	}
	
	public static void main(String[] args)
	{
		int arr[] = new int[5];
		int max;
		int min;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		
		for(int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
		
		max = maxValue(arr);
		min = minValue(arr);
		
		System.out.printf("입력한 숫자의 최대값은 %d입니다.\n", max);
		System.out.printf("입력한 숫자의 최솟값은 %d입니다.\n", min);
		
	}

}
