import { Scanner } from 'readline-sync';

function reverse(number: number): void {
  while (number !== 0) {
    const remainder = number % 10;
    console.log(remainder);
    number = Math.floor(number / 10);
  }
  console.log();
}

function main(): void {
  console.log('Enter an integer: ');
  const input = new Scanner();
  const number = input.nextInt();
  reverse(number);
}

main();

