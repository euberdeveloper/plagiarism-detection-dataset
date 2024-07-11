import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function main() {
  rl.question('Enter an integer: ', (input) => {
    const angka = parseInt(input);

    let reversed = '';
    while (angka !== 0) {
      reversed += (angka % 10).toString();
      angka = Math.floor(angka / 10);
    }

    console.log(reversed);
    rl.close();
  });
}

main();

