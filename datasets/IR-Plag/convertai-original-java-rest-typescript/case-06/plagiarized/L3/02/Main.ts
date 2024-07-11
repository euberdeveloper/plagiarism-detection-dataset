import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

const number: number[] = new Array(10);

const readNumbers = (): Promise<void> => {
  return new Promise((resolve) => {
    for (let i = 0; i < 10; i++) {
      rl.question(`Read a number: `, (input) => {
        number[i] = parseInt(input);
        if (i === 9) {
          resolve();
        }
      });
    }
  });
};

const printNumbers = (): void => {
  for (let i = 9; i >= 0; i--) {
    console.log(number[i]);
  }
};

const main = async (): Promise<void> => {
  await readNumbers();
  printNumbers();
  rl.close();
};

main();

