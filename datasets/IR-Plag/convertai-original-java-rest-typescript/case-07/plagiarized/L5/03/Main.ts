import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

console.log("Enter a 4 by 4 matrix row by row:");

const n: number[][] = [];

rl.on('line', (input) => {
  const row = input.split(' ').map(Number);
  n.push(row);
  if (n.length === 4) {
    rl.close();
    let sum = 0;
    for (let i = 0; i < n.length; i++) {
      sum += n[i][i];
    }
    console.log(`Sum of the elements in the major diagonal is ${sum}`);
  }
});

