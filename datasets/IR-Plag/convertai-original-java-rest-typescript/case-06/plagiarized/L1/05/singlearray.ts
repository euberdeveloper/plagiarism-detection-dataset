import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

const num: number[] = new Array(10);

const readNumbers = (): Promise<void> => {
  return new Promise((resolve) => {
    let i = 0;
    const readNumber = (): void => {
      rl.question('Read a number: ', (input) => {
        num[i] = parseInt(input);
        i++;
        if (i < 10) {
          readNumber();
        } else {
          resolve();
        }
      });
    };
    readNumber();
  });
};

const printNumbers = (): void => {
  for (let i = 9; i >= 0; i--) {
    console.log(num[i]);
  }
  rl.close();
};

readNumbers().then(printNumbers);

