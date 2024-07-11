import { Scanner } from 'readline-sync';

function sumMajorDiagonal(m: number[][]): number {
  let hasil = 0;
  for (let i = 0; i < 4; i++) {
    for (let j = 0; j < 4; j++) {
      if (i === j) {
        hasil += m[i][j];
      }
    }
  }
  return hasil;
}

function main(): void {
  const sc = new Scanner();
  const matriks: number[][] = new Array(4).fill(0).map(() => new Array(4).fill(0));
  console.log('Enter a 4-by-4 matrix row by row: ');
  for (let i = 0; i < 4; i++) {
    for (let j = 0; j < 4; j++) {
      matriks[i][j] = sc.nextDouble();
    }
  }

  console.log(`Sum of the elements in the major diagonal is ${sumMajorDiagonal(matriks)}`);
}

main();

