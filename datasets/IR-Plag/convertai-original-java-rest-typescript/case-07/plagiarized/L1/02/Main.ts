import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function sumMajorDiagonal(m: number[][]): number {
  let sum = 0;

  for (let i = 0; i < m.length; i++) {
    sum += m[i][i];
  }

  return sum;
}

rl.question('Enter a 4 by 4 matrix row by row: ', (input) => {
  const rows = input.trim().split('\n');
  const m: number[][] = [];

  for (const row of rows) {
    m.push(row.trim().split(' ').map(Number));
  }

  console.log(`Sum of the elements in the major diagonal is ${sumMajorDiagonal(m)}`);

  rl.close();
});

