import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

console.log("Enter the radius and length of a cylinder: ");

rl.on('line', (input) => {
  const [radius, length] = input.split(' ').map(Number);
  const areas = radius * radius * 3.14159;
  const volumes = areas * length;

  console.log(`The area is ${areas}`);
  console.log(`The volume of the cylinder is ${volumes}`);

  rl.close();
});

