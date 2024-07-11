import { Console } from 'console';

console.log('Miles\t\tKilometers');
console.log('-------------------------------');

let miles: number = 1;

while (miles <= 10) {
  console.log(`${miles}\t\t${miles * 1.609}`);
  miles++;
}

