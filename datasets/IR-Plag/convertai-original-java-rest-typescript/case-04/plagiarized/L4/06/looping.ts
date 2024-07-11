import { Scanner } from 'readline-sync';

function print(mil: number): void {
  while (mil <= 10) {
    console.log(`${mil}\t\t${mil * 1.609}`);
    mil++;
  } // looping dari 1 sampai 10
}

function main(): void {
  console.log('Miles\t\tKilometers');
  console.log('-------------------------------');
  let mil: number;
  print((mil = 1));
}

main();

