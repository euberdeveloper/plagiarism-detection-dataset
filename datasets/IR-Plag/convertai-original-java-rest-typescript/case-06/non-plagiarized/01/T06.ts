import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

const input: number[] = [];

const readNumber = (): Promise<void> => {
  return new Promise((resolve) => {
    rl.question('Read a number: ', (num) => {
      input.push(parseInt(num));
      resolve();
    });
  });
};

const main = async (): Promise<void> => {
  for (let i = 0; i < 10; i++) {
    await readNumber();
  }

  for (let i = 9; i >= 0; i--) {
    console.log(input[i]);
  }

  rl.close();
};

main();

