import { readlineSync } from 'readline-sync';

function inputMatrix(matrix: number[][], n: number): void {
    for (let i = 0; i < n; i++) {
        for (let j = 0; j < n; j++) {
            matrix[i][j] = readlineSync.prompt('Enter a number: ', { float: true });
        }
    }
}

function sumMajorDiagonal(matrix: number[][]): void {
    let sum = 0;
    for (let i = 0; i < matrix.length; i++) {
        sum += matrix[i][i];
    }
    console.log(`Sum of the elements in the major diagonal is ${sum}`);
}

function main(): void {
    const n = 4;
    console.log('Enter a 4 by 4 matrix row by row:');
    const matrix: number[][] = new Array(n).fill(0).map(() => new Array(n).fill(0));
    inputMatrix(matrix, n);
    sumMajorDiagonal(matrix);
}

main();

