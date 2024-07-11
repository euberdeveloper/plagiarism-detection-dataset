import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function tampil(angka: number[]): void {
  for (let x = 9; x >= 0; x--) {
    console.log(angka[x]);
  }
}

function main(): void {
  const arrAngka: number[] = new Array(10);

  for (let x = 0; x < arrAngka.length; x++) {
    rl.question('Read a number: ', (input) => {
      arrAngka[x] = parseInt(input);
      if (x === arrAngka.length - 1) {
        tampil(arrAngka);
        rl.close();
      }
    });
  }
}

main();

