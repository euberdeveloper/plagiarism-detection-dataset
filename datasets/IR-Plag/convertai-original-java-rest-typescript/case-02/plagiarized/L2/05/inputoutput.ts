import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('Enter the radius and length of a cylinder: ', (input) => {
  const [rad, panjang] = input.split(' ').map(Number);

  const a = rad * rad * 3.14159;
  const vol = a * panjang;

  console.log(`The area is ${a}`);
  console.log(`The volume of the cylinder is ${vol}`);

  rl.close();
});

