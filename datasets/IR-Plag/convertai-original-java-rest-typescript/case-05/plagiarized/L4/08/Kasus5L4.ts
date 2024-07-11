import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('Enter an integer: ', (input) => {
  const angka = parseInt(input);

  let reversed = '';
  while (angka !== 0) {
    const temp = angka % 10;
    angka = Math.floor(angka / 10);
    reversed += temp;
  }

  console.log(reversed);
  rl.close();
});

