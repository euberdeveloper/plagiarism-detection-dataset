import { Scanner } from 'util';

/**
 *
 * @author 92E0988C1682C76D4D307AA15EC8346E
 */
const milToKilo: number = 1.609;

console.log('Miles\tKilometers');
for (let i: number = 1; i < 11; i++) {
  const kilo: number = i * milToKilo;
  console.log(`${i}\t${kilo}`);
}

