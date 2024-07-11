import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

console.log("Miles\t\tKilometers");
console.log("-------------------------------");

let miles: number = 1;
while (miles <= 10) {
  console.log(`${miles}\t\t${miles * 1.609}`);
  miles++;
}

rl.close();

