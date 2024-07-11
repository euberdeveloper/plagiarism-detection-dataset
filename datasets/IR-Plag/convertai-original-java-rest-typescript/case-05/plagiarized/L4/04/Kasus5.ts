import { Scanner } from 'readline-sync';

function reverse(number: number): void {
  console.log(number % 10);
}

function main(): void {
  console.log('Enter an integer: ');
  const input = new Scanner();
  const number = input.nextInt();

  while (number > 0) {
    reverse(number);
    number = Math.floor(number / 10);
  }
  console.log('');
}

main();

