import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function main() {
  const matrix: number[][] = new Array(4).fill(0).map(() => new Array(4).fill(0));
  let sum = 0;

  console.log('Enter a 4-by-4 matrix row by row:');

  rl.on('line', (line) => {
    const row = line.trim().split(' ').map(Number);
    for (let j = 0; j < 4; j++) {
      matrix[row.length][j] = row[j];
      if (row.length === j) {
        sum += row[j];
      }
    }

    if (row.length === 4) {
      console.log(`Sum of the elements in the major diagonal is ${sum}`);
      rl.close();
    }
  });
}

main();

