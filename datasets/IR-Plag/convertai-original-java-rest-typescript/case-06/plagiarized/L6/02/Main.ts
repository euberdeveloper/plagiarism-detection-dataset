import { Scanner } from 'readline-sync';

function printNumber(number: number[]): void {
  for (let i = 0; i < 10; i++) {
    console.log(number[i]);
  }
}

function main(): void {
  const s = new Scanner();
  const number: number[] = new Array(10);
  let i = 9;
  while (i >= 0) {
    console.log('Read a number: ');
    number[i] = s.nextInt();
    i--;
  }

  printNumber(number);
}

main();

