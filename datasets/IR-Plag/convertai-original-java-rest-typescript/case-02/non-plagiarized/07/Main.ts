import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

console.log("Enter the radius and length of a cylinder:");

rl.question('Radius: ', (radiusInput) => {
  const radius = parseFloat(radiusInput);

  rl.question('Length: ', (lengthInput) => {
    const length = parseInt(lengthInput);

    const area = radius * radius * 3.14159;
    const volume = length * radius;

    console.log(`The area is ${area}`);
    console.log(`The volume is ${volume}`);

    rl.close();
  });
});

