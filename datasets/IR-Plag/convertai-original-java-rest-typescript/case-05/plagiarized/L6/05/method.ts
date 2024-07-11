import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function beautyReverse(num: number): void {
  for (; num > 0; num = Math.floor(num / 100 * 10)) {
    console.log(num % 10);
  }
  console.log();
}

function reverse(): void {
  rl.question('Enter an integer: ', (input) => {
    const n = parseInt(input);
    beautyReverse(n);
    rl.close();
  });
}

reverse();

