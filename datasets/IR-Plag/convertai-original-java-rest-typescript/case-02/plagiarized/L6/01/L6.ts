import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function hitLuas(jari2: number): number {
  return jari2 * jari2 * 3.14159;
}

function total(luas: number, panjang: number): number {
  return luas * panjang;
}

rl.question('Enter the radius and length of a cylinder: ', (input) => {
  const [jari2, panjang] = input.split(' ').map(Number);
  const luas = hitLuas(jari2);
  const totalVolume = total(luas, panjang);

  console.log(`The area is ${luas}, The volume of the cylinder is ${totalVolume}`);
  rl.close();
});

