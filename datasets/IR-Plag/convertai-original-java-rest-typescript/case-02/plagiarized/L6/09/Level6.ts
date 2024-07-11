import { Scanner } from 'readline-sync';

function main(): void {
  const in: Scanner = new Scanner();
  let radius: number, height: number;

  // Get input
  console.log('Enter the radius and length of a cylinder: ');
  radius = in.nextDouble();
  height = in.nextDouble();

  count(radius, height);
}

function count(rad: number, height: number): void {
  console.log(`The area is ${Math.pow(rad, 2) * Math.PI}`);
  console.log(`The volume of the cylinder is ${Math.pow(rad, 2) * Math.PI * height}`);
}

main();

