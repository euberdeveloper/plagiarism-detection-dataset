import { Scanner } from 'readline-sync';

/**
 *
 * @author FD8DBE9073AFCC0504CD6901E1091CAD
 */
function main(): void {
    const input: Scanner = new Scanner();
    console.log('Enter a 4 by 4 matrix row by row: ');
    const m: number[][] = new Array(4).fill(0).map(() => new Array(4).fill(0));
    for (let i = 0; i < 4; i++) {
        for (let j = 0; j < 4; j++) {
            m[i][j] = input.nextDouble();
        }
    }
    console.log(`Sum of the elements in the major diagonal is ${sumMajorDiagonal(m)}`);
}

/**
 * Function to sum the major diagonal
 * @param m the 4x4 matrix
 * @returns the sum of the major diagonal
 */
function sumMajorDiagonal(m: number[][]): number {
    let sum = 0;
    for (let i = 0; i < m.length; i++) {
        sum += m[i][i];
    }
    return sum;
}

main();

