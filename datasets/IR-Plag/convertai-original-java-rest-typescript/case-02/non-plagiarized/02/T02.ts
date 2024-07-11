import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('Enter the radius and length of a cylinder: ', (input) => {
  const [r, l] = input.split(' ').map(parseFloat);
  console.log(`The area is ${r * r * 3.14159}`);
  console.log(`The volume is ${(r * r * 3.14159) * l}`);
  rl.close();
});

