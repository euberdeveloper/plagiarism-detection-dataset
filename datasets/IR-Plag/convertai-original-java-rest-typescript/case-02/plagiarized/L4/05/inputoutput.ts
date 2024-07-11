import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

let rad: number;
let panjang: number;

function input(): void {
  rl.question('Enter the radius and length of a cylinder: ', (input) => {
    const [r, l] = input.split(' ').map(Number);
    rad = r;
    panjang = l;
    rl.close();
  });
}

function hitArea(): number {
  return rad * rad * 3.14159;
}

function main(): void {
  input();

  const a = hitArea();
  const vol = a * panjang;

  console.log(`The area is ${a}`);
  console.log(`The volume of the cylinder is ${vol}`);
}

main();

