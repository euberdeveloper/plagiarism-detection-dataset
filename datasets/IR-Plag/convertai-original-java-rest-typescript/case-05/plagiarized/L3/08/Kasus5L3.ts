import { Scanner } from 'readline-sync';

function reverseNumber(angka: number): void {
  // proses membalikkan angka
  while (angka !== 0) {
    // mengambil angka terakhir
    const temp = angka % 10;
    // membuang angka terakhir
    angka = Math.floor(angka / 10);
    // tampilkan angka yang diambil
    process.stdout.write(temp.toString());
  }
  console.log();
}

function main(): void {
  // input data
  const inp = new Scanner();
  console.log('Enter an integer: ');
  const angka = inp.nextInt();
  reverseNumber(angka);
}

main();

