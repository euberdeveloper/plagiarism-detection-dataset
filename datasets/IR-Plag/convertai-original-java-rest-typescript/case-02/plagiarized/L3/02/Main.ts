import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('Enter the radius and length of a cylinder: ', (input) => {
  const [r, len] = input.split(' ').map(Number);
  const a = r * r * 3.14159;
  const volume = a * len;

  console.log(`The area is ${a}`);
  console.log(`The volume of the cylinder is ${volume}`);

  rl.close();
});

