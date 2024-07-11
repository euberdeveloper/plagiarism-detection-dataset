import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function terbalik(angka: number): void {
  while (angka > 0) {
    const sisa = angka % 10;
    console.log(sisa);
    angka = Math.floor(angka / 10);
  }
  console.log();
}

rl.question('Enter an integer: ', (input) => {
  const inputNumber = parseInt(input);
  terbalik(inputNumber);
  rl.close();
});

