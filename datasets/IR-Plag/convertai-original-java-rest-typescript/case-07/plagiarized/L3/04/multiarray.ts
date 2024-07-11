package IR;

import java.util.*;

class multiarray {
    // Adds all elements in the main diagonal of the matrix
    public static sum(m: number[][]): number {
        let sum = 0;
        for (let i = 0; i < m.length; i++) {
            sum += m[i][i];
        }
        return sum;
    }

    public static main(args: string[]): void {
        let i: number, j: number;

        console.log("Enter a 4 by 4 matrix row by row: ");
        let ma: number[][] = new Array(4).fill(0).map(() => new Array(4).fill(0));
        // Input the array
        let input = new Scanner(System.in);
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                ma[i][j] = input.nextDouble();
            }
        }
        console.log("Sum of the elements in the major diagonal is " + this.sum(ma));
    }
}

