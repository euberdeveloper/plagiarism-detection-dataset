import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('Enter the radius and length of a cylinder: ', (radlen) => {
  const splited = radlen.split(/\s+/);
  const rad = parseFloat(splited[0]);
  const len = parseFloat(splited[1]);

  console.log(`The area is ${Math.round(rad * rad * 3.14159 * 10000.0) / 10000.0}`);
  console.log(`The volume is ${Math.round(rad * rad * 3.14159 * len * 10.0) / 10.0}`);

  rl.close();
});

