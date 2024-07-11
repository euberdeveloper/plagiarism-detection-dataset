package IR;

import java.util.*;

class singlearray
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		int[] num = new int[10];
		for (int i = 0; i < 10; i++) 
		{
			System.out.print(
			"Read a number: ");
			num[i] = input.nextInt();
		}
		for (int i = 9; i >= 0; i--) 
		{
			System.out.println(num[i]);
		}
	}
}