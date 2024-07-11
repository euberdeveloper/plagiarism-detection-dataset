import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function hitungDiagonal(matrix: number[][]): number {
  let total = 0;
  for (let i = 0; i < matrix.length; i++) {
    total += matrix[i][i];
  }
  return total;
}

rl.question('Enter a 4 by 4 matrix row by row: ', (input) => {
  const matrix: number[][] = [];
  const rows = input.trim().split('\n');
  for (const row of rows) {
    matrix.push(row.trim().split(' ').map(Number));
  }

  const hasil = hitungDiagonal(matrix);
  console.log(`Sum of the elements in the major diagonal is ${hasil}`);

  rl.close();
});

