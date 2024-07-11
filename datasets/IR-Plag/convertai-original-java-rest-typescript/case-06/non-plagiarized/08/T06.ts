import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function main(): void {
  const a: number[] = new Array(10);
  for (let i = 0; i < 10; i++) {
    rl.question('Read a number', (input) => {
      a[i] = parseInt(input);
    });
  }
  for (let i = 0; i < 10; i++) {
    console.log(a[9 - i]);
  }
  rl.close();
}

main();
