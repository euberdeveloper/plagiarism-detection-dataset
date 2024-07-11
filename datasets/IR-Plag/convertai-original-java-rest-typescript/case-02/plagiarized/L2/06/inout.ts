import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('Enter the radius and length of a cylinder: ', (input) => {
  const [rad, l] = input.split(' ').map(Number);
  const ar = rad * rad * 3.14159;
  const vol = ar * l;

  console.log(`The area is ${ar}`);
  console.log(`The volume of the cylinder is ${vol}`);

  rl.close();
});

