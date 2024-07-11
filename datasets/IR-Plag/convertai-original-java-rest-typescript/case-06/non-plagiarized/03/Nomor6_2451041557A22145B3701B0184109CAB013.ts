import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

const Array: number[] = new Array(10);

const readNumbers = () => {
  return new Promise<void>((resolve) => {
    let i = 0;
    const readNumber = () => {
      console.log('Read a number: ');
      rl.question('', (input) => {
        Array[i] = parseInt(input);
        i++;
        if (i < 10) {
          readNumber();
        } else {
          resolve();
        }
      });
    };
    readNumber();
  });
};

const printArrayReversed = () => {
  for (let i = 9; i >= 0; i--) {
    console.log(Array[i]);
  }
};

const main = async () => {
  await readNumbers();
  printArrayReversed();
  rl.close();
};

main();

