import { printf } from 'util';

console.log('Miles\tKilometers');

for (let i = 1; i <= 10; i++) {
  printf('%d\t%.3f\n', i, i * 1.609);
}

