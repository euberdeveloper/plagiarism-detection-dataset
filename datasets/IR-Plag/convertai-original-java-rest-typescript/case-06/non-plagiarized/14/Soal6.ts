import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function reverse(number: string): void {
  for (let i = number.length - 1; i >= 0; i--) {
    console.log(number.charAt(i));
  }
}

rl.question('Read a number: ', (input) => {
  let numbers = '';
  for (let i = 0; i < 10; i++) {
    rl.question('Read a number: ', (num) => {
      numbers += num;
      if (i === 9) {
        reverse(numbers);
        rl.close();
      }
    });
  }
});

