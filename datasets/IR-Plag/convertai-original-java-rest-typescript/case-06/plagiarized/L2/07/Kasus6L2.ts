import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

const arrNum: number[] = new Array(10);

console.log('Read a number:');

const readNumbers = () => {
  rl.question('', (input) => {
    const num = parseInt(input);
    arrNum.push(num);
    if (arrNum.length < 10) {
      console.log('Read a number:');
      readNumbers();
    } else {
      for (let i = 9; i >= 0; i--) {
        console.log(arrNum[i]);
      }
      rl.close();
    }
  });
};

readNumbers();

