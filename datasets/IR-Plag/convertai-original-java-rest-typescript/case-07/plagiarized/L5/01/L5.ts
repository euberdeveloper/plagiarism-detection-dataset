package IR;

import java.util.Scanner;

class L5 {
    static jumlahDiagonal(m: number[][]): number {
        let sum: number = 0;
        let hit: number = 0;

        while (hit !== m.length) {
            sum += m[hit][hit];
            hit++;
        }
        return sum;
    }

    static print(m: number[][]): void {
        console.log(`Sum of the elements in the major diagonal is ${L5.jumlahDiagonal(m)}`);
    }

    static main(args: string[]): void {
        const sc: Scanner = new Scanner(System.in);
        const m: number[][] = new Array(4).fill(0).map(() => new Array(4).fill(0));
        console.log("Enter a 4 by 4 matrix row by row: ");

        for (let i: number = 0; i < 4; i++) {
            for (let j: number = 0; j < 4; j++) {
                m[i][j] = sc.nextDouble();
            }
        }
        L5.print(m);
    }
}

