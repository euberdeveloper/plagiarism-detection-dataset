import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

const arr: number[] = new Array(10);

console.log('Read a number:');

const readNumbers = (): Promise<void> => {
  return new Promise((resolve) => {
    rl.on('line', (input) => {
      arr.push(parseInt(input));
      if (arr.length === 10) {
        rl.close();
        resolve();
      } else {
        console.log('Read a number:');
      }
    });
  });
};

readNumbers().then(() => {
  for (let i = 9; i >= 0; i--) {
    console.log(arr[i]);
  }
  rl.close();
});

