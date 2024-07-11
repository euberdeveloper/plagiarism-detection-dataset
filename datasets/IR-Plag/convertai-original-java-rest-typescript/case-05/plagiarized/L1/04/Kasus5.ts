import { Scanner } from 'readline-sync';

function main(): void {
  console.log('Enter an integer: ');
  const input: Scanner = new Scanner();
  let number: number = input.nextInt();
  while (number !== 0) {
    const remainder: number = number % 10;
    console.log(remainder);
    number = Math.floor(number / 10);
  }
  console.log();
}

main();

