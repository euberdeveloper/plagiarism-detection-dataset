import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

const n: number[] = new Array(10);

const readNumbers = () => {
  for (let i = 0; i < 10; i++) {
    rl.question('Read a number: ', (num) => {
      n[i] = parseInt(num);
      if (i === 9) {
        printNumbers();
        rl.close();
      }
    });
  }
};

const printNumbers = () => {
  for (let a = 9; a >= 0; a--) {
    console.log(n[a]);
  }
};

readNumbers();

