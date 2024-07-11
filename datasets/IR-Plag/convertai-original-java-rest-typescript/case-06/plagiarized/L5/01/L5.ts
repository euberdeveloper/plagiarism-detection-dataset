import { readlineSync } from 'readline-sync';

function print(arr: number[]): void {
  let i = 9;
  while (i >= 0) {
    console.log(arr[i]);
    i--;
  }
}

function main(): void {
  const angka: number[] = new Array(10);
  let i = 0;
  while (i !== 10) {
    console.log('Read a number: ');
    angka[i] = Number(readlineSync.question());
    i++;
  }

  print(angka);
}

main();

