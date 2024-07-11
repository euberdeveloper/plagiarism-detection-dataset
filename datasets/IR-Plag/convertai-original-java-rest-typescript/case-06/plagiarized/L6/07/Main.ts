import { readlineSync } from 'readline-sync';

const angka: number[] = new Array(10);

for (let i = 0; i < 10; i++) {
  console.log('Read a number:');
  angka[i] = readlineSync.questionInt();
}

showArray(angka);

function showArray(angka: number[]): void {
  let i = 0;
  while (i <= 9) {
    console.log(angka[i]);
    i++;
  }
}

