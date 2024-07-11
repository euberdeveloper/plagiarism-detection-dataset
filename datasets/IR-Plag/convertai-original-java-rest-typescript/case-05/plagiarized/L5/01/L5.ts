import { readlineSync } from 'readline-sync';

function main(): void {
  let nomor: number, sisa: number = 0;
  console.log('Enter an integer: ');
  nomor = Number(readlineSync.prompt());

  while (nomor !== 0) {
    sisa = nomor % 10;
    console.log(sisa);
    nomor = Math.floor(nomor / 10);
  }
  console.log();
}

main();

