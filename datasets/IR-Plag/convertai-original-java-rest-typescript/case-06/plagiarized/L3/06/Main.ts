import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

const angka: number[] = new Array(10);

const readNumbers = () => {
  for (let i = 0; i < 10; i++) {
    rl.question(`Read a number: `, (num) => {
      angka[i] = parseInt(num);
      if (i === 9) {
        displayArray();
        rl.close();
      }
    });
  }
};

const displayArray = () => {
  for (let i = 9; i >= 0; i--) {
    console.log(angka[i]);
  }
};

readNumbers();

