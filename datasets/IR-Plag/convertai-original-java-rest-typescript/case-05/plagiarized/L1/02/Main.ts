import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function reverse(number: number): void {
  while (number !== 0) {
    const remainder = number % 10;
    console.log(remainder);
    number = Math.floor(number / 10);
  }
  console.log();
}

rl.question('Enter an integer: ', (input) => {
  const number = parseInt(input, 10);
  reverse(number);
  rl.close();
});

