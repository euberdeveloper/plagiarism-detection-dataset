import { Scanner } from 'readline-sync';

const inp: Scanner = new Scanner();

const matrix: number[][] = new Array(4).fill(0).map(() => new Array(4).fill(0));
let i: number = 0;
let sum: number = 0;

console.log('Enter a 4 by 4 matrix row by row: ');

while (i < 4) {
  let j: number = 0;
  while (j < 4) {
    matrix[i][j] = inp.nextDouble();
    if (i === j) {
      sum += matrix[i][j];
    }
    j++;
  }
  i++;
}

console.log(`Sum of the elements in the major diagonal is ${sum}`);

