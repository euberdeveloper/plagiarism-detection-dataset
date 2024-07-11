import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function print(arr: number[]) {
  let i = 9;
  let j = 0;
  while (j < 10) {
    console.log(arr[i]);
    i--;
    j++;
  }
}

function main() {
  const angka: number[] = new Array(10);
  let i = 0;
  while (i !== 10) {
    rl.question('Read a number: ', (input) => {
      angka[i] = parseInt(input);
      i++;
      if (i === 10) {
        print(angka);
        rl.close();
      }
    });
  }
}

main();

