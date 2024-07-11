import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

const num: number[] = new Array(10);

const readNumber = (): Promise<void> => {
  return new Promise((resolve) => {
    rl.question('Read a number: ', (answer) => {
      num[num.length - 1] = parseInt(answer);
      num.unshift(num.pop()!);
      resolve();
    });
  });
};

const main = async (): Promise<void> => {
  for (let i = 0; i < 10; i++) {
    await readNumber();
  }

  for (let i = 0; i < 10; i++) {
    console.log(num[i]);
  }

  rl.close();
};

main();

