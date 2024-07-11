import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

let radius: number, length: number, areas: number, volumes: number;

function cetak(): void {
  console.log(`The area is ${areas}`);
  console.log(`The volume of the cylinder is ${volumes}`);
}

rl.question('Enter the radius and length of a cylinder: ', (input) => {
  const [radiusInput, lengthInput] = input.split(' ');
  radius = parseFloat(radiusInput);
  length = parseFloat(lengthInput);
  areas = radius * radius * 3.14159;
  volumes = areas * length;
  cetak();
  rl.close();
});

