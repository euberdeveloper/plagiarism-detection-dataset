import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

const num: number[] = new Array(10);

console.log('Read a number:');

rl.on('line', (input) => {
  for (let i = 0; i < 10; i++) {
    num[i] = parseInt(input);
  }

  for (let i = 9; i >= 0; i--) {
    console.log(num[i]);
  }

  rl.close();
});

