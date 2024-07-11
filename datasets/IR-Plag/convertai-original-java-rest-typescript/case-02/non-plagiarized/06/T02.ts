import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('Enter the radius and the length of the cilinder : ', (input) => {
  const [rad, length] = input.split(' ').map(Number);
  const area = Math.PI * rad * rad;
  const volume = Math.PI * rad * rad * length;
  console.log(`The area is ${area}`);
  console.log(`The volume is ${volume}`);
  rl.close();
});

