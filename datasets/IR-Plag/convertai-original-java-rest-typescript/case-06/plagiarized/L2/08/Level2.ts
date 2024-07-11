import { Scanner } from 'readline-sync';

function main(): void {
  const masukkan: Scanner = new Scanner();
  const number: number[] = new Array(10);

  // Masukkan data
  for (let a: number = 0; a < 10; a++) {
    console.log('Read a number: ');
    number[a] = masukkan.nextInt();
  }

  // Tampilkan ke layar
  for (let a: number = 9; a >= 0; a--) {
    console.log(number[a]);
  }
}

main();

