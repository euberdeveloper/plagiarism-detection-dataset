import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

const a: number[] = new Array(10);

const readNumbers = () => {
  for (let i = 0; i < 10; i++) {
    rl.question('Read a number: ', (number) => {
      a[i] = parseInt(number);
    });
  }
};

const printNumbersReversed = () => {
  for (let i = 9; i >= 0; i--) {
    console.log(a[i]);
  }
};

const main = () => {
  readNumbers();
  printNumbersReversed();
  rl.close();
};

main();

