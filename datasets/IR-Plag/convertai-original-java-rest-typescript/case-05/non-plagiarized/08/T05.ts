import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('Enter an integer: ', (input) => {
  const a = parseInt(input);
  const b = a.toString();
  let result = '';
  for (let i = b.length - 1; i >= 0; i--) {
    result += b[i];
  }
  console.log(result);
  rl.close();
});

