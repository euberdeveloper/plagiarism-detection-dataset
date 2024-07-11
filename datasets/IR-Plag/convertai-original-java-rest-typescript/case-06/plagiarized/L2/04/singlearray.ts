import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

const n: number[] = new Array(10);

const readNumber = (): Promise<void> => {
  return new Promise((resolve) => {
    rl.question('Read a number: ', (input) => {
      n[n.length - 1] = parseInt(input);
      n.unshift(n.pop()!);
      resolve();
    });
  });
};

const main = async () => {
  for (let i = 0; i < 10; i++) {
    await readNumber();
  }

  for (let a = 0; a < 10; a++) {
    console.log(n[a]);
  }

  rl.close();
};

main();

