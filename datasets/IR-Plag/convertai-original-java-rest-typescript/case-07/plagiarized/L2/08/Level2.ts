import { Scanner } from 'readline-sync';

/**
 *
 * @author FD8DBE9073AFCC0504CD6901E1091CAD
 */
class Level2 {
    public static main(args: string[]): void {
        const sc = new Scanner();
        console.log('Enter a 4 by 4 matrix row by row: ');
        const matrix: number[][] = new Array(4).fill(0).map(() => new Array(4).fill(0));
        for (let x = 0; x < 4; x++) {
            for (let y = 0; y < 4; y++) {
                matrix[x][y] = sc.nextDouble();
            }
        }
        console.log(`Sum of the elements in the major diagonal is ${this.hitungDiagonal(matrix)}`);
    }

    public static hitungDiagonal(matrix: number[][]): number {
        let jumlah = 0;
        for (let i = 0; i < matrix.length; i++) {
            jumlah += matrix[i][i];
        }
        return jumlah;
    }
}

Level2.main([]);

