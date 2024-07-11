import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function hitungArea(jejari: number): number {
  return Math.pow(jejari, 2) * 3.14159;
}

function hitungVolume(panjang: number, jejari: number): number {
  return hitungArea(jejari) * panjang;
}

rl.question('Enter the radius and length of a cylinder: ', (input) => {
  const [jejari, panjang] = input.split(' ').map(Number);

  console.log('The area is', hitungArea(jejari));
  console.log('The volume of the cylinder is', hitungVolume(panjang, jejari));

  rl.close();
});

