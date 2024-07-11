import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function hitungVol(ar: number, l: number): number {
  return ar * l;
}

function hitungAr(rad: number): number {
  return rad * rad * 3.14159;
}

rl.question('Enter the radius and length of a cylinder: ', (input) => {
  const [rad, l] = input.split(' ').map(Number);
  const ar = hitungAr(rad);
  const vol = hitungVol(ar, l);
  console.log(`The area is ${ar}`);
  console.log(`The volume of the cylinder is ${vol}`);
  rl.close();
});

