import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

const arr: number[] = new Array(10);

const readNumber = (): Promise<number> => {
  return new Promise((resolve) => {
    rl.question('Read a number: ', (input) => {
      resolve(parseInt(input));
    });
  });
};

const main = async () => {
  for (let i = 0; i < 10; i++) {
    arr[i] = await readNumber();
  }

  for (let i = 9; i >= 0; i--) {
    console.log(arr[i]);
  }

  rl.close();
};

main();

