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
		
		System.out.print("���� �Է� : ");
		
		for(int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
		
		max = maxValue(arr);
		min = minValue(arr);
		
		System.out.printf("�Է��� ������ �ִ밪�� %d�Դϴ�.\n", max);
		System.out.printf("�Է��� ������ �ּڰ��� %d�Դϴ�.\n", min);
		
	}

}
