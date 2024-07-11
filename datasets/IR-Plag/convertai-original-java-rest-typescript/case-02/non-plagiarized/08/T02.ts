import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

console.log("Enter the radius and length of a cylinder:");

rl.question('Radius: ', (radiusInput) => {
  rl.question('Length: ', (lengthInput) => {
    const radius = parseFloat(radiusInput);
    const length = parseFloat(lengthInput);
    const area = Math.pow(radius, 2) * Math.PI;
    const volume = area * length;

    console.log(`The area is ${area}`);
    console.log(`The volume is ${volume}`);

    rl.close();
  });
});

