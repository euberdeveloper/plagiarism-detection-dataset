import { Console } from 'console';

const mil: number = 1;

console.log('Miles\t\tKilometers');
console.log('-------------------------------');

while (mil <= 10) {
  console.log(`${mil}\t\t${mil * 1.609}`);
  mil++;
}

