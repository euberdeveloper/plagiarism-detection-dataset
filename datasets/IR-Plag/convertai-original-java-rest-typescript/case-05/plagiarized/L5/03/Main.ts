import { Scanner } from 'readline-sync';

let number: number;

function main(): void {
  const input: Scanner = new Scanner();
  console.log('Enter an integer: ');
  number = input.nextInt();
  for (let i = 0; number !== 0; i++) {
    const remainder: number = number % 10;
    console.log(remainder);
    number = Math.floor(number / 10);
  }
  console.log();
}

main();

