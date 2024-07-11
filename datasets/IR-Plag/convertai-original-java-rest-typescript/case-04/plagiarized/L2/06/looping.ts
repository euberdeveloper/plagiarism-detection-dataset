import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

console.log("Miles\t\tKilometers");
console.log("-------------------------------");

let mil: number = 1;
while (mil <= 10) {
  console.log(`${mil}\t\t${mil * 1.609}`);
  mil++;
}

