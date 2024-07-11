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
  let get = 0;
  do {
    get = nmb % 10;
    // output
    process.stdout.write(get.toString());
    nmb = Math.floor(nmb / 10);
  } while (nmb !== 0);
  console.log();
}

async function main(): Promise<void> {
  const nmb = await input();
  // reverse number
  await reverse(nmb);
  rl.close();
}

main();

