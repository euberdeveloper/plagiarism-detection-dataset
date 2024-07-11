import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function main() {
  rl.question('Enter an integer: ', (input) => {
    const angka = parseInt(input);
    let sisaBagi: number;

    while (angka !== 0) { // ulang sampai tidak bisa dibagi integer dengan 10
      sisaBagi = angka % 10;
      console.log(sisaBagi);
      angka = Math.floor(angka / 10);
    }
    console.log();
    rl.close();
  });
}

main();

