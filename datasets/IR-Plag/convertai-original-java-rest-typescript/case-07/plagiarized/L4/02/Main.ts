import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function inputData(mtx: number[][]): void {
  for (let i = 0; i < 4; i++) {
    for (let j = 0; j < 4; j++) {
      rl.question(`Enter element at row ${i}, column ${j}: `, (input) => {
        mtx[i][j] = parseFloat(input);
      });
    }
  }
}

function sumMajorDiagonal(mtx: number[][]): number {
  let sum = 0;
  for (let i = 0; i < mtx.length; i++) {
    sum += mtx[i][i];
  }
  return sum;
}

function main(): void {
  const mtx: number[][] = new Array(4).fill(0).map(() => new Array(4).fill(0));

  console.log('Enter a 4 by 4 matrix row by row:');
  inputData(mtx);

  console.log(`Sum of the elements in the major diagonal is ${sumMajorDiagonal(mtx)}`);
  rl.close();
}

main();

