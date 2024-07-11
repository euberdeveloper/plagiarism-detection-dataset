import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

const angka: number[] = new Array(10);

function showArray(angka: number[]): void {
  let i = 9;
  while (i >= 0) {
    console.log(angka[i]);
    i--;
  }
}

function main(): void {
  for (let i = 0; i < 10; i++) {
    rl.question('Read a number: ', (input) => {
      angka[i] = parseInt(input);
      if (i === 9) {
        showArray(angka);
        rl.close();
      }
    });
  }
}

main();

