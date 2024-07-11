import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function input(): Promise<number> {
  return new Promise((resolve) => {
    rl.question('Enter an integer: ', (answer) => {
      resolve(parseInt(answer));
    });
  });
}

async function main() {
  const nmb = await input();
  reverse(nmb);
  rl.close();
}

function reverse(nmb: number) {
  let get = 0;
  while (nmb !== 0) {
    get = nmb % 10;
    console.log(get);
    nmb = Math.floor(nmb / 10);
  }
  console.log();
}

main();

