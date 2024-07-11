import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function ngitung(matriks: number[][]): void {
  let jumlah = 0;
  let i = 3;
  while (i >= 0) {
    jumlah += matriks[i][i];
    i--;
  }
  console.log(`Sum of the elements in the major diagonal is ${jumlah}`);
}

rl.question('Enter a 4 by 4 matrix row by row: ', (input) => {
  const mat: number[][] = [];
  const rows = input.trim().split('\n');
  for (const row of rows) {
    const values = row.trim().split(' ').map(Number);
    mat.push(values);
  }

  ngitung(mat);
  rl.close();
});

