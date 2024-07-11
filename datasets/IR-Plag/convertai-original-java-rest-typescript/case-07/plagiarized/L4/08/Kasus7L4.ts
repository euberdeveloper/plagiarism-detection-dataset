import { Scanner } from 'readline-sync';

const inp: Scanner = new Scanner();

const matrix: number[][] = new Array(4).fill(0).map(() => new Array(4).fill(0));

console.log('Enter a 4 by 4 matrix row by row:');

for (let i = 0; i < 4; i++) {
  for (let j = 0; j < 4; j++) {
    matrix[i][j] = inp.nextDouble();
  }
}

let sum: number = 0;
for (let i = 0; i < matrix.length; i++) {
  sum += matrix[i][i];
}

console.log(`Sum of the elements in the major diagonal is ${sum}`);

