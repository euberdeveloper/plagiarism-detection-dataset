import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function reverse(number: number): void {
  const cek: string = number.toString();
  let result: string = '';
  for (let i = cek.length - 1; i >= 0; i--) {
    result += cek[i];
  }
  console.log(result);
}

rl.question('Enter an integer ', (input) => {
  const a: number = parseInt(input);
  reverse(a);
  rl.close();
});

