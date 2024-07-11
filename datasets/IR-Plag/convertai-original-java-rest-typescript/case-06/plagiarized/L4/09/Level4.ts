import { Scanner } from 'readline-sync';

function proses() {
  const in: Scanner = new Scanner();
  const angka: number[] = new Array(10);

  for (let a = 0; a < 10; a++) {
    console.log('Read a number: ');
    angka[a] = in.nextInt();
  }

  for (let b = 9; b >= 0; b--) {
    console.log(angka[b]);
  }
}

function main() {
  proses();
}

main();

