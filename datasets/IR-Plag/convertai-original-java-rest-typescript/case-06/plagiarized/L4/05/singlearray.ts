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

rl.question('Read a number: ', (num) => {
  n[0] = parseInt(num);
  for (let i = 1; i < 10; i++) {
    rl.question('Read a number: ', (num) => {
      n[i] = parseInt(num);
      if (i === 9) {
        print();
        rl.close();
      }
    });
  }
});

