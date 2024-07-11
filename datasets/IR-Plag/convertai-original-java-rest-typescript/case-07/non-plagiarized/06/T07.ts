import * as readline from 'readline';

/**
 *
 * @author 92E0988C1682C76D4D307AA15EC8346E
 */
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function sumMajorDiagonal(m: number[][]): number {
  let result = 0;
  for (let i = 0; i < 4; i++) {
    result += m[i][i];
  }
  return result;
}

rl.question('Enter a 4-by-4 matrix row to row: ', (input) => {
  const matrix: number[][] = [];
  const rows = input.trim().split('\n');
  for (const row of rows) {
    matrix.push(row.trim().split(' ').map(Number));
  }

  const result = sumMajorDiagonal(matrix);
  console.log(`Sum of the element in the major diagonal is ${result}`);

  rl.close();
});

