import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function reverse(number: number): void {
  const numberString: string = number.toString();
  let reversedString: string = '';
  for (let i = numberString.length - 1; i >= 0; i--) {
    reversedString += numberString[i];
  }
  console.log(reversedString);
}

rl.question('Enter an integer: ', (input) => {
  const number: number = parseInt(input);
  reverse(number);
  rl.close();
});

