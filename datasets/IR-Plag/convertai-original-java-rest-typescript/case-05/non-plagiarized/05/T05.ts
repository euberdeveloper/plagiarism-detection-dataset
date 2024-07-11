import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function reverse(number: number): void {
  let balik = '';
  while (number > 0) {
    balik += (number % 10).toString();
    number = Math.floor(number / 10);
  }
  console.log(balik);
}

rl.question('Enter an integer: ', (input) => {
  const number = parseInt(input);
  reverse(number);
  rl.close();
});

