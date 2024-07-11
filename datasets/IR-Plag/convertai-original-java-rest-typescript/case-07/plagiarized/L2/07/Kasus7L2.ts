import { Scanner } from 'readline-sync';

function jumlahDiagonalKanan(matrix: number[][]): number {
  let sum = 0;
  for (let i = 0; i < matrix.length; i++) {
    sum += matrix[i][i];
  }
  return sum;
}

function main(): void {
  const inp = new Scanner();
  console.log('Enter a 4 by 4 matrix row by row:');
  const matrix: number[][] = [];
  for (let i = 0; i < 4; i++) {
    const row: number[] = [];
    for (let j = 0; j < 4; j++) {
      row.push(inp.nextDouble());
    }
    matrix.push(row);
  }
  console.log(`Sum of the elements in the major diagonal is ${jumlahDiagonalKanan(matrix)}`);
}

main();

