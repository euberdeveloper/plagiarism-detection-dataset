import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

console.log("Enter the radius and length of a cylinder: ");

rl.on('line', (input) => {
  const [r, l] = input.split(' ').map(Number);
  console.log("The area is " + r*r*Math.PI);
  console.log("The volume of the cylinder is " + r*r*Math.PI*l);
  rl.close();
});

