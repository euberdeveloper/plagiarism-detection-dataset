import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('Enter an integer: ', (input) => {
  const angka: number = parseInt(input);
  let remainder: number;

  for (angka; angka !== 0; angka = Math.floor(angka / 10)) {
    remainder = angka % 10;
    process.stdout.write(remainder.toString());
  }

  console.log();
  rl.close();
});

