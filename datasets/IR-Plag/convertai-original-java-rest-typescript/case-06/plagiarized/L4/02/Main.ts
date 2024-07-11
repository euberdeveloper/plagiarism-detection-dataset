import { Scanner } from 'readline-sync';

function printNumber(number: number[]): void {
  for (let i = 9; i >= 0; i--) {
    console.log(number[i]);
  }
}

function main(): void {
  const s = new Scanner();
  const number: number[] = new Array(10);

  for (let i = 0; i < 10; i++) {
    console.log('Read a number: ');
    number[i] = s.nextInt();
  }

  printNumber(number);
}

main();

