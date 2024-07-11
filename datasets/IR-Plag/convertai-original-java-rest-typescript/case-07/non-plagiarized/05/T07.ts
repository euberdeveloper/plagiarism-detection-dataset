import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function sumMajorDiagonal(m: number[][]): number {
  let jumdiagonal = 0;
  for (let i = 0; i < 4; i++) {
    for (let j = 0; j < 4; j++) {
      if (i === j) {
        jumdiagonal += m[i][j];
      }
    }
  }
  return jumdiagonal;
}

rl.question('Enter a 4-by4 matrix row by row:\n', (input) => {
  const numbers: number[][] = [];
  const rows = input.trim().split('\n');
  for (const row of rows) {
    const values = row.split(/\s+/).map(Number);
    numbers.push(values);
  }

  console.log(`Sum of the elements in the major diagonal is ${sumMajorDiagonal(numbers)}`);
  rl.close();
});

