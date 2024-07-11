import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

const n: number[] = new Array(10);

function print(): void {
  for (let a = 9; a >= 0; a--) {
    console.log(n[a]);
  }
}

function main(): void {
  let i = 0;
  while (i < 10) {
    rl.question('Read a number: ', (input) => {
      n[i] = parseInt(input);
      i++;
      if (i === 10) {
        print();
        rl.close();
      }
    });
  }
}

main();

