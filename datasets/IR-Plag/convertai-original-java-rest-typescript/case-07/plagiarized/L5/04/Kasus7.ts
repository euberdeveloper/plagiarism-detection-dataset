import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function sumMajorDiagonal(matrix: number[][], n: number): void {
  let sum = 0;

  for (let i = 0; i < n; i++) {
    for (let j = 0; j < n; j++) {
      rl.question(`Enter element at (${i}, ${j}): `, (input) => {
        matrix[i][j] = parseFloat(input);
        if (i === j) {
          sum += matrix[i][j];
        }
        if (i === n - 1 && j === n - 1) {
          console.log(`Sum of the elements in the major diagonal is ${sum}`);
          rl.close();
        }
      });
    }
  }
}

console.log('Enter a 4 by 4 matrix row by row:');
const matrix: number[][] = new Array(4).fill(0).map(() => new Array(4).fill(0));
sumMajorDiagonal(matrix, 4);

