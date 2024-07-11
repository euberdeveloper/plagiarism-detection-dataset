import { Scanner } from 'readline-sync';

function reverse(angka: number): void {
  // Di sini mengulang hingga number habis
  while (angka !== 0) {
    const remainder = angka % 10;
    console.log(remainder);
    angka = Math.floor(angka / 10);
  }
  console.log();
}

function main(): void {
  const input = new Scanner();
  console.log('Enter an integer: ');
  const angka = input.nextInt();
  // Memanggil fungsi reverse untuk membalik nilai yang dihasilkan
  reverse(angka);
}

main();

