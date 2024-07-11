import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function area(r: number): number {
  return r * r * 3.14159;
}

function volume(len: number, a: number): number {
  return len * a;
}

rl.question('Enter the radius and length of a cylinder: ', (input) => {
  const [r, len] = input.split(' ').map(Number);
  const a = area(r);
  const vol = volume(len, a);

  console.log(`The area is ${a}`);
  console.log(`The volume of the cylinder is ${vol}`);

  rl.close();
});

