import { Scanner } from 'readline-sync';

function sum(x: number[][]): number {
  let jumlah = 0;
  for (let i = 0; i < 4; i++) {
    jumlah += x[i][i];
  }
  return jumlah;
}

function hasil(x: number[][]): void {
  console.log(`Sum of the elements in the major diagonal is ${sum(x)}`);
}

function main(): void {
  const sc = new Scanner();
  const matriks: number[][] = new Array(4).fill(0).map(() => new Array(4).fill(0));

  console.log('Enter a 4 by 4 matrix row by row:');
  for (let bar = 0; bar < 4; bar++) {
    for (let kol = 0; kol < 4; kol++) {
      matriks[bar][kol] = sc.nextDouble();
    }
  }

  hasil(matriks);
}

main();

