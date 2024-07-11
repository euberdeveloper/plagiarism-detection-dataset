import { Scanner } from 'readline-sync';

function print(mil: number): void {
  for (let i = mil; i <= 10; i++) {
    const x = Math.floor(i * 1.609);
    console.log(`${i}\t\t${x}`);
  }
}

console.log('Miles\t\tKilometers');
console.log('-------------------------------');
print(1);

