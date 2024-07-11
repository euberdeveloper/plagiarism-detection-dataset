import * as readline from 'readline';

/**
 *
 * @author 9BC88124A9BB1C629D5FFBCD81612170
 */
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function sumMajorDiagonal(m: number[][]): number {
  let sum = 0;
  for (let i = 0; i < 4; i++) {
    sum += m[i][i];
  }
  return sum;
}

rl.question('Enter a 4-by-4 matrix row by row\n', (input) => {
  const matrix: number[][] = [];
  const rows = input.trim().split('\n');
  for (const row of rows) {
    matrix.push(row.trim().split(' ').map(Number));
  }
  console.log(`Sum of the elements in the major diagonal is ${sumMajorDiagonal(matrix)}`);
  rl.close();
});

