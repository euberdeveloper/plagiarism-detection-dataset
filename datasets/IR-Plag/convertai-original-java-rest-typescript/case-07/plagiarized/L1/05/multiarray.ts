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
  const m: number[][] = [];
  const rows = input.trim().split('\n');
  for (let i = 0; i < 4; i++) {
    const row = rows[i].trim().split(' ').map(Number);
    m.push(row);
  }

  console.log(`Sum of the elements in the major diagonal is ${sumMajorDiagonal(m)}`);
  rl.close();
});

