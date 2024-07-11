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

async function reverse(nmb: number): Promise<void> {
  let x = 1;
  const rev = nmb.toString();
  do {
    console.log(rev.charAt(rev.length - x));
    x++;
    nmb = Math.floor(nmb / 10);
  } while (nmb !== 0);
  console.log();
}

async function main(): Promise<void> {
  const nmb = await input();
  await reverse(nmb);
  rl.close();
}

main();

