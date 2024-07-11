import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function hitungLuasAlas(rad: number): number {
  const luasAlas = rad * rad * 3.14159;
  return luasAlas;
}

function hitungVolume(luasAlas: number, tinggi: number): number {
  const volume = luasAlas * tinggi;
  return volume;
}

rl.question('Enter the radius and length of a cylinder: ', (input) => {
  const [radius, tinggi] = input.split(' ').map(Number);

  console.log('The area is', hitungLuasAlas(radius));
  console.log('The volume of the cylinder is', hitungVolume(hitungLuasAlas(radius), tinggi));

  rl.close();
});

