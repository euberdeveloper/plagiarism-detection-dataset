import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function hitungVol(ar: number, l: number): void {
  const vol = ar * l;
  console.log(`The volume of the cylinder is ${vol}`);
}

function hitungAr(rad: number): number {
  const ar = rad * rad * 3.14159;
  console.log(`The area is ${ar}`);
  return ar;
}

rl.question('Enter the radius and length of a cylinder: ', (input) => {
  const [rad, l] = input.split(' ').map(Number);
  hitungVol(hitungAr(rad), l);
  rl.close();
});

