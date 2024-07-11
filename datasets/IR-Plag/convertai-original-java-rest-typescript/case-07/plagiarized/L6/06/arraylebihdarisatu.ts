import { Scanner } from 'readline-sync';

function HitungDiagonal(): number {
  const sc = new Scanner();
  let hasil = 0;
  const matrix: number[][] = new Array(4).fill(0).map(() => new Array(4).fill(0));

  console.log('Enter a 4 by 4 matrix row by row:');

  for (let x = 0; x < 4; x++) {
    for (let y = 0; y < 4; y++) {
      matrix[x][y] = sc.nextDouble();
      if (x === y) {
        hasil += matrix[x][y];
      }
    }
  }

  return hasil;
}

console.log(`Sum of the elements in the major diagonal is ${HitungDiagonal()}`);

