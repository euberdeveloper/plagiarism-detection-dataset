import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

const nums: number[] = new Array(10);

const readNumbers = () => {
  for (let i = 0; i < 10; i++) {
    rl.question('Read a number: ', (num) => {
      nums[i] = parseInt(num);
    });
  }
};

const displayArray = () => {
  for (let i = 9; i >= 0; i--) {
    console.log(nums[i]);
  }
};

readNumbers();
displayArray();

rl.close();

