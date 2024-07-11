import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

const arrAngka: number[] = new Array(10);

const readNumbers = () => {
  for (let x = 0; x < 10; x++) {
    rl.question('Read a number: ', (num) => {
      arrAngka[x] = parseInt(num);
    });
  }
};

const printNumbers = () => {
  for (let x = 9; x >= 0; x--) {
    console.log(arrAngka[x]);
  }
  rl.close();
};

readNumbers();
printNumbers();

