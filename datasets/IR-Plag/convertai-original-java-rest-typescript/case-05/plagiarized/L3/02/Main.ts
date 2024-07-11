import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function reverse(nmb: number): void {
  let get: number = 0;
  while (nmb !== 0) {
    get = nmb % 10;
    console.log(get);
    nmb = Math.floor(nmb / 10);
  }
  console.log();
}

rl.question('Enter an integer: ', (input) => {
  const nmb: number = parseInt(input);
  reverse(nmb);
  rl.close();
});

