import { Scanner } from 'readline-sync';

function balik(number: number): void {
  while (number !== 0) {
    const remainder = number % 10;
    console.log(remainder);
    number = Math.floor(number / 10);
  }
  console.log();
}

const input = new Scanner();
console.log('Enter an integer: ');
const number = input.nextInt();
balik(number);

