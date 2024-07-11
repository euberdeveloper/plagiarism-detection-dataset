import { Scanner } from 'readline-sync';

function reverse(number: number): void {
  if (number > 0) {
    console.log(number % 10);
    reverse(Math.floor(number / 10));
  }
}

function main(): void {
  console.log('Enter an integer: ');
  const input = new Scanner();
  const number = input.nextInt();

  reverse(number);
  console.log('');
}

main();

