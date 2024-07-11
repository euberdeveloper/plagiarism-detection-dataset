import { readlineSync } from 'readline-sync';

function sumMajorDiagonal(m: number[][]): number {
  let sum = 0;
  for (let i = 0; i < m.length; i++) {
    sum += m[i][i];
  }
  return sum;
}

function main(): void {
  let arr: number[][] = [];
  console.log('Enter a 4 by 4 matrix row by row:');
  for (let i = 0; i < 4; i++) {
    let row: number[] = [];
    for (let j = 0; j < 4; j++) {
      row.push(readlineSync.prompt('Enter a number: ', { float: true }));
    }
    arr.push(row);
  }
  console.log(`Sum of the elements in the major diagonal is ${sumMajorDiagonal(arr)}`);
}

main();

