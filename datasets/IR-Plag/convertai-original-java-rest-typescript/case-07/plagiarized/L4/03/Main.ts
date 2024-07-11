import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

console.log("Enter a 4 by 4 matrix row by row:");

rl.on('line', (input) => {
  const n: number[][] = [];
  const numbers = input.split(' ').map(Number);

  for (let i = 0; i < 4; i++) {
    n.push(numbers.slice(i * 4, (i + 1) * 4));
  }

  let sum = 0;
  for (let i = 0; i < n.length; i++) {
    sum += n[i][i];
  }

  console.log(`Sum of the elements in the major diagonal is ${sum}`);
  rl.close();
});

