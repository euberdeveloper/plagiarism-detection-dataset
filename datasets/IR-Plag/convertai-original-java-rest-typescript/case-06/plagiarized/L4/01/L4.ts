import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function print(arr: number[]) {
  for (let i = 9; i >= 0; i--) {
    console.log(arr[i]);
  }
}

function main() {
  const angka: number[] = new Array(10);

  rl.on('line', (input) => {
    for (let i = 0; i < 10; i++) {
      console.log('Read a number: ');
      angka[i] = parseInt(input);
    }
    print(angka);
    rl.close();
  });
}

main();

