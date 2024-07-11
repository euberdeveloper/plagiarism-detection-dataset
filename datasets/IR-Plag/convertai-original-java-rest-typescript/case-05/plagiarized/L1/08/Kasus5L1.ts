import { Scanner } from 'readline-sync';

function reverse(number: number): void {
  // proses membalikkan angka
  while (number !== 0) {
    // mengambil angka terakhir
    const remainder = number % 10;
    // tampilkan angka yang diambil
    process.stdout.write(remainder.toString());
    // membuang angka terakhir
    number = Math.floor(number / 10);
  }
  console.log();
}

function main(): void {
  // input data
  console.log('Enter an integer: ');
  const input = new Scanner();
  const number = input.nextInt();
  reverse(number);
}

main();

