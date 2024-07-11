import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

const number: number[] = new Array(10);

const readNumber = (index: number): void => {
  rl.question('Read a number: ', (input) => {
    number[index] = parseInt(input);
    if (index < 9) {
      readNumber(index + 1);
    } else {
      rl.close();
      for (let i = 9; i >= 0; i--) {
        console.log(number[i]);
      }
    }
  });
};

readNumber(0);

