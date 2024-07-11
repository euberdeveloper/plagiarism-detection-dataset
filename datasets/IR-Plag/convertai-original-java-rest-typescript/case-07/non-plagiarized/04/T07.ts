import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function sumMajorDiagonal(m: number[][]): number {
  let sum = 0;
  for (let i = 0; i < 4; i++) {
    for (let j = 0; j < 4; j++) {
      if (i === j) {
        sum += m[i][j];
      }
    }
  }
  return sum;
}

rl.question('Enter a 4-by-4 matrix row by row\n', (input) => {
  const rows = input.trim().split('\n');
  const matrix: number[][] = [];
  for (const row of rows) {
    matrix.push(row.trim().split(' ').map(Number));
  }
  console.log(`Sum of the elements in the major diagonal is ${sumMajorDiagonal(matrix)}`);
  rl.close();
});

