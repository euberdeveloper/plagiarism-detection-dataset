import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

console.log("Miles       Kilometers");

for (let i = 1; i < 11; i++) {
  if (i < 10) {
    console.log(`${i}           ${i * 1609}`);
  } else {
    console.log(`${i}          ${i * 1609}`);
  }
}

rl.close();

