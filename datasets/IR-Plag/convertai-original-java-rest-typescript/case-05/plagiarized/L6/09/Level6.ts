import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function rekursif(bil: number): number {
  if (bil !== 0) {
    const sisaMod = bil % 10;
    console.log(sisaMod);
    return rekursif(Math.floor(bil / 10));
  }
  return bil;
}

rl.question('Enter an integer: ', (input) => {
  const bil = parseInt(input, 10);
  rekursif(bil);
  console.log('');
  rl.close();
});

