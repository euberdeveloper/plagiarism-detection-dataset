import * as readline from 'readline';

function reverse(number: number): void {
  // Di sini mengulang hingga number habis
  while (number !== 0) {
    const remainder = number % 10;
    console.log(remainder);
    number = Math.floor(number / 10);
  }
  console.log();
}

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('Enter an integer: ', (input) => {
  const number = parseInt(input, 10);
  // Memanggil fungsi reverse untuk membalik nilai yang dihasilkan
  reverse(number);
  rl.close();
});

