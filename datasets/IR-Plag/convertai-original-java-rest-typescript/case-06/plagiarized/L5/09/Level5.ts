import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

const arrAngka: number[] = new Array(10);

const readNumber = (): Promise<number> => {
  return new Promise((resolve) => {
    rl.question('Read a number: ', (input) => {
      resolve(parseInt(input));
    });
  });
};

const main = async () => {
  for (let x = 0; x < 10; x++) {
    arrAngka[x] = await readNumber();
  }

  for (let x = 9; x >= 0; x--) {
    console.log(arrAngka[x]);
  }

  rl.close();
};

main();

