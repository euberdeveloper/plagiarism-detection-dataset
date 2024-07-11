import { Scanner } from 'readline-sync';

function printNumber(number: number[]): void {
  for (let i = 9; i >= 0; i--) {
    console.log(number[i]);
  }
}

function main(): void {
  const s = new Scanner();
  const number: number[] = new Array(10);
  let i = 0;
  while (i < 10) {
    console.log('Read a number: ');
    number[i] = s.nextInt();
    i++;
  }

  printNumber(number);
}

main();

