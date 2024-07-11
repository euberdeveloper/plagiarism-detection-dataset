import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('Enter the radius and length of a cylinder: ', (input) => {
  const [radiusStr, lengthStr] = input.split(' ');
  const radius = parseFloat(radiusStr);
  const length = parseFloat(lengthStr);
  const area = radius * radius * 3.14159;
  const volume = area * length;
  console.log(`The area is ${area}, `);
  console.log(`The volume of the cylinder is ${volume}`);
  rl.close();
});

