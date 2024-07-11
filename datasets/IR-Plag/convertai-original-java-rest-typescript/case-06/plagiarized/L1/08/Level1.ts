import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

const num: number[] = new Array(10);

const readNumbers = () => {
  for (let i = 0; i < 10; i++) {
    rl.question(`Read a number: `, (input) => {
      num[i] = parseInt(input);
    });
  }
  displayNumbers();
};

const displayNumbers = () => {
  for (let i = 9; i >= 0; i--) {
    console.log(num[i]);
  }
  rl.close();
};

readNumbers();
