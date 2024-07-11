import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

const a: number[] = new Array(10);

const readNumber = (): Promise<number> => {
  return new Promise((resolve) => {
    rl.question('Read a number: ', (input) => {
      resolve(parseInt(input));
    });
  });
};

const main = async () => {
  for (let i = 0; i < a.length; i++) {
    a[i] = await readNumber();
  }

  for (let i = a.length - 1; i >= 0; i--) {
    console.log(a[i]);
  }

  rl.close();
};

main();

