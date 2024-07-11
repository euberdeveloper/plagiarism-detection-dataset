import { Scanner } from 'readline-sync';

function main(): void {
  const sc = new Scanner();

  console.log('Enter a 4 by 4 matrix row by row: ');
  const matrix: number[][] = new Array(4).fill(0).map(() => new Array(4).fill(0));

  for (let x = 0; x < 4; x++) {
    for (let y = 0; y < 4; y++) {
      matrix[x][y] = sc.nextDouble();
    }
  }

  console.log(`Sum of the elements in the major diagonal is ${calculateDiagonal(matrix)}`);
}

function calculateDiagonal(matrix: number[][]): number {
  let total = 0;
  for (let i = 0; i < matrix.length; i++) {
    total += matrix[i][i];
  }
  return total;
}

main();

