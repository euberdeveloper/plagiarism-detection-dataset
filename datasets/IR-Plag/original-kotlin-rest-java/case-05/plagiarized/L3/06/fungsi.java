package IR

import java.util.Scanner;

public class fungsi {

    public static void main(String[] args) {
         System.out.print("Enter an integer: ");
        
        Scanner sc = new Scanner(System.in);
        int   input;
        input =    sc.nextInt();//input integer
        terbalik(input);//memanggil fungsi reverse
    }

    public static void terbalik(int angka)  {
        while (angka != 0) {//looping sampai angka habis
             int   sisa ;
             sisa= angka % 10;//membagi bilangan tersebut dengan 0 sampai tidak ada hasil bagi
            System.out.print(sisa);
            angka = angka / 10;
        }
        
        System.out.println();
    }
}
