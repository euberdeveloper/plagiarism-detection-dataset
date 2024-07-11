import { Scanner } from 'readline-sync';

function jumlahDiagonalKanan(matrix: number[][]): number {
  let sum = 0;
  for (let i = 0; i < matrix.length; i++) {
    sum += matrix[i][i];
  }
  return sum;
}

function main(): void {
  // minta input
  const inp = new Scanner();
  const matrix: number[][] = new Array(4).fill(0).map(() => new Array(4).fill(0));
  console.log('Enter a 4 by 4 matrix row by row:');

  // input the matrix
  for (let i = 0; i < 4; i++) {
    for (let j = 0; j < 4; j++) {
      matrix[i][j] = inp.nextDouble();
    }
  }
  console.log(`Sum of the elements in the major diagonal is ${jumlahDiagonalKanan(matrix)}`);
}

main();

