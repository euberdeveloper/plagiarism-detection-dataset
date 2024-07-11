import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

let a: number;

function reverse(number: number): void {
  let reverse = 0;
  while (number !== 0) {
    reverse = reverse * 10;
    reverse = reverse + number % 10;
    number = Math.floor(number / 10);
  }
  console.log(reverse);
}

rl.question('Enter an integer:', (input) => {
  a = parseInt(input);
  reverse(a);
  rl.close();
});

