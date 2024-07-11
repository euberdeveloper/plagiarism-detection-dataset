import { readlineSync } from 'readline-sync';

function balik(nomor: number): void {
  while (nomor !== 0) {
    const sisa = nomor % 10;
    console.log(sisa);
    nomor = Math.floor(nomor / 10);
  }
  console.log();
}

function main(): void {
  console.log('Enter an integer: ');
  const nomor = readlineSync.questionInt();
  balik(nomor);
}

main();

