package IR;

import java.util.*;

class method{
	//prog utama
	public static void main(String[] args) 
	{
			System.out.print("Enter an integer: ");
			Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		//pamggil method
			beautyReverse(n);
	}
	
	//method reverse
	public static void beautyReverse(int num) 
	{
		while (num != 0)
			{
			int r = num % 10;
				System.out.print(r);
			num = num / 10;
		}
		System.out.println();
	}
}