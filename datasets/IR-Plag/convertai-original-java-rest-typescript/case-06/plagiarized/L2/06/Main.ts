import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

const angka: number[] = new Array(10);

const readNumber = (): Promise<void> => {
  return new Promise((resolve) => {
    rl.question('Read a number: ', (answer) => {
      angka[angka.length - 1] = parseInt(answer);
      angka.pop();
      resolve();
    });
  });
};

const main = async (): Promise<void> => {
  for (let i = 0; i < 10; i++) {
    await readNumber();
  }

  for (let i = 9; i >= 0; i--) {
    console.log(angka[i]);
  }

  rl.close();
};

main();

