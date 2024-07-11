import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function inputData(mtx: number[][]): void {
  let i = 0;
  let j = 0;
  while (i < 4) {
    while (j < 4) {
      rl.question(`Enter element at (${i}, ${j}): `, (input) => {
        mtx[i][j] = parseFloat(input);
        j++;
        if (j === 4) {
          j = 0;
          i++;
        }
        if (i === 4) {
          rl.close();
        }
      });
    }
  }
}

function sumMajorDiagonal(mtx: number[][]): number {
  let sum = 0;
  for (let i = 0; i < mtx.length; i += 2) {
    sum += mtx[i][i] + mtx[i + 1][i + 1];
  }
  return sum;
}

function main(): void {
  const mtx: number[][] = new Array(4).fill(0).map(() => new Array(4).fill(0));

  console.log('Enter a 4 by 4 matrix row by row:');
  inputData(mtx);

  console.log(`Sum of the elements in the major diagonal is ${sumMajorDiagonal(mtx)}`);
}

main();

