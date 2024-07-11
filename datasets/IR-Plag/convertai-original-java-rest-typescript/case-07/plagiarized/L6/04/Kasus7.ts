import { Scanner } from 'readline-sync';

function inputMatrix(matrix: number[][], n: number): void {
  const sc = new Scanner();

  for (let i = 0; i < n; i++) {
    for (let j = 0; j < n; j++) {
      matrix[i][j] = sc.nextDouble();
    }
  }
}

function sumMajorDiagonal(matrix: number[][], n: number): number {
  if (n >= 0) {
    return matrix[n][n] + sumMajorDiagonal(matrix, --n);
  } else {
    return 0;
  }
}

function main(): void {
  const n = 4;
  console.log('Enter a 4 by 4 matrix row by row: ');
  const matrix: number[][] = new Array(n).fill(0).map(() => new Array(n).fill(0));

  inputMatrix(matrix, n);
  console.log(`Sum of the elements in the major diagonal is ${sumMajorDiagonal(matrix, n - 1)}`);
}

main();

