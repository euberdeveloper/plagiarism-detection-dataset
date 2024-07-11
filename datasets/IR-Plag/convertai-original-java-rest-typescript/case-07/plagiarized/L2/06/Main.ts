import { readlineSync } from 'readline-sync';

/**
 * Sums the elements in the major diagonal of a 4x4 matrix.
 * @param arr - The 4x4 matrix.
 * @returns The sum of the elements in the major diagonal.
 */
function sumMajorDiagonal(arr: number[][]): number {
    let sum = 0;
    for (let i = 0; i < 4; i++) {
        sum += arr[i][i];
    }
    return sum;
}

function main(): void {
    console.log('Enter a 4 by 4 matrix row by row:');
    const arr: number[][] = [];
    for (let i = 0; i < 4; i++) {
        const row = readlineSync.question('').split(' ').map(Number);
        arr.push(row);
    }
    const result = sumMajorDiagonal(arr);
    console.log(`Sum of the elements in the major diagonal is ${result}`);
}

main();

