import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function reverse(number: number): void {
  let remainder: number;
  while (number !== 0) {
    remainder = number % 10;
    console.log(remainder);
    number = Math.floor(number / 10);
  }
  console.log();
}

rl.question('Enter an integer: ', (input) => {
  const angka: number = parseInt(input);
  reverse(angka);
  rl.close();
});

