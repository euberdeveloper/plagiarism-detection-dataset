import { Scanner } from 'readline-sync';

function balik(angka: number): void {
  while (angka !== 0) {
    const sisa = angka % 10;
    console.log(sisa);
    angka = Math.floor(angka / 10);
  }
  console.log();
}

function main(): void {
  console.log('Enter an integer: ');
  const in: Scanner = new Scanner();
  const angka: number = in.nextInt();
  balik(angka);
}

main();

