import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('Enter an integer: ', (inputStr) => {
  const input = parseInt(inputStr);
  let temp = input;

  while (temp !== 0) {
    const remainder = temp % 10;
    process.stdout.write(remainder.toString());
    temp = Math.floor(temp / 10);
  }

  console.log();
  rl.close();
});

