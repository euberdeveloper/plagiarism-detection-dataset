import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

const numbers: number[] = [];

const readNumber = (): Promise<void> => {
  return new Promise((resolve) => {
    rl.question('Read a number: ', (input) => {
      numbers.push(parseInt(input));
      resolve();
    });
  });
};

const main = async (): Promise<void> => {
  for (let i = 0; i < 10; i++) {
    await readNumber();
  }

  for (let i = 9; i >= 0; i--) {
    console.log(numbers[i]);
  }

  rl.close();
};

main();

