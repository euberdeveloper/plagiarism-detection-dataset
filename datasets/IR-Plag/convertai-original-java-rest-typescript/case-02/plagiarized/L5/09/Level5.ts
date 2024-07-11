import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function hitung(radius: number, tinggi: number): void {
  const area = radius * radius * 3.14159;
  const volume = radius * radius * 3.14159 * tinggi;
  console.log(`The area is ${area}`);
  console.log(`The volume of the cylinder is ${volume}`);
}

rl.question('Enter the radius and length of a cylinder: ', (input) => {
  const [radiusStr, heightStr] = input.split(' ');
  const radius = parseFloat(radiusStr);
  const tinggi = parseFloat(heightStr);
  hitung(radius, tinggi);
  rl.close();
});

