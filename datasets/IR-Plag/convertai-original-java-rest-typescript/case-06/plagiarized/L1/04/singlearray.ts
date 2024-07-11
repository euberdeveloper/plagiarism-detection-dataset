import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

const num: number[] = new Array(10);

const readNumbers = () => {
  return new Promise<void>((resolve) => {
    for (let i = 0; i < 10; i++) {
      rl.question(`Read a number: `, (input) => {
        num[i] = parseInt(input);
        if (i === 9) {
          resolve();
        }
      });
    }
  });
};

const printNumbersReversed = () => {
  for (let i = 9; i >= 0; i--) {
    console.log(num[i]);
  }
};

const main = async () => {
  await readNumbers();
  printNumbersReversed();
  rl.close();
};

main();

