import { Scanner } from 'readline-sync';

class T07 {
    public static main(args: string[]): void {
        const sc = new Scanner();
        const arr: number[][] = new Array(4).fill(0).map(() => new Array(4).fill(0));

        console.log("Enter a 4-by-4 row by row: ");
        for (let i = 0; i < 4; i++) {
            for (let j = 0; j < 4; j++) {
                arr[i][j] = sc.nextDouble();
            }
            console.log("");
        }
        T07.sumMajorDiagonal(arr);
    }

    public static sumMajorDiagonal(m: number[][]): number {
        const total = m[0][0] + m[1][1] + m[2][2] + m[3][3];
        console.log("Sum of the elements in the major diagonal is " + total);
        return total;
    }
}

