import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function reverse(number: number): void {
  let temp = number;
  let digits = 0;
  while (number !== 0) {
    number = Math.floor(number / 10);
    digits++;
  }
  number = temp;
  let sum = 0;
  for (let i = digits; i > 0; i--) {
    let multiplier = 1;
    let lastDigit = number % 10;
    for (let j = 1; j < i; j++) {
      multiplier *= 10;
    }
    sum += lastDigit * multiplier;
    number = Math.floor(number / 10);
  }
  console.log(sum);
}

rl.question('Enter an integer: ', (input) => {
  const angka = parseInt(input);
  reverse(angka);
  rl.close();
});

