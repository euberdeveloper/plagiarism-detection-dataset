import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('Enter the radius and length of a cylinder: ', (input) => {
  const [jari2, panjang] = input.split(' ').map(Number);
  const luas = jari2 * jari2 * 3.14159;
  const total = luas * panjang;

  console.log(`The area is ${luas}`);
  console.log(`The volume of the cylinder is ${total}`);

  rl.close();
});

