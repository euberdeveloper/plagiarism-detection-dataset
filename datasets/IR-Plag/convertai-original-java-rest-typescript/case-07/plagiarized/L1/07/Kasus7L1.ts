import { Scanner } from 'readline-sync';

function sumMajorDiagonal(m: number[][]): number {
  let sum = 0;
  for (let i = 0; i < m.length; i++) {
    sum += m[i][i];
  }
  return sum;
}

function main(): void {
  // Get input
  const input = new Scanner();
  console.log('Enter a 4 by 4 matrix row by row:');
  const m: number[][] = [];
  for (let i = 0; i < 4; i++) {
    m[i] = [];
    for (let j = 0; j < 4; j++) {
      m[i][j] = input.nextDouble();
    }
  }

  // Calculate and print the sum of the major diagonal
  console.log(`Sum of the elements in the major diagonal is ${sumMajorDiagonal(m)}`);
}

main();

