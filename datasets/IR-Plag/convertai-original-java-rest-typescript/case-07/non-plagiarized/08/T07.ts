import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function sumMajorDiagonal(m: number[][]): number {
  let hasil = 0;
  for (let i = 0; i < 4; i++) {
    for (let j = 0; j < 4; j++) {
      rl.question('', (input) => {
        m[i][j] = parseFloat(input);
        if (i === j) {
          hasil += m[i][j];
        }
      });
    }
  }
  return hasil;
}

function main(): void {
  const m: number[][] = new Array(4).fill(0).map(() => new Array(4).fill(0));
  console.log('Enter a 4-by-4 matrix row by row:');
  console.log(`Sum of the elements in the major diagonal is ${sumMajorDiagonal(m)}`);
  rl.close();
}

main();

