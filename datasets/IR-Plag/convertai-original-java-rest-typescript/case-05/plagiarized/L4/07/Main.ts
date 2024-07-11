import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('Enter an integer: ', (input) => {
  const angka: number = parseInt(input);
  let result: string = '';

  while (angka !== 0) {
    const remainder: number = angka % 10;
    result = remainder.toString() + result;
    angka = Math.floor(angka / 10);
  }

  console.log(result);
  rl.close();
});

