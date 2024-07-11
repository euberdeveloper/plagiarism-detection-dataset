import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

const n: number[] = new Array(10);

function print(): void {
  for (let a = 0; a <= 9; a++) {
    console.log(n[9 - a]);
  }
}

function main(): void {
  let i = 9;
  let a = 0;
  while (i >= 0) {
    rl.question('Read a number: ', (input) => {
      n[a] = parseInt(input);
      a++;
      i--;
      if (i < 0) {
        print();
        rl.close();
      }
    });
  }
}

main();

