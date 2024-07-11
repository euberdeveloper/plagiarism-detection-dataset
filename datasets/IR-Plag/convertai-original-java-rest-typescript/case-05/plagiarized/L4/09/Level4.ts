import { Scanner } from 'readline-sync';

function main(): void {
  const masukkan: Scanner = new Scanner();
  let number: number;
  let sisaBagi: number;

  console.log('Enter an integer: ');
  number = masukkan.nextInt();

  while (number !== 0) {
    sisaBagi = number % 10;
    console.log(sisaBagi);
    number = Math.floor(number / 10);
  }
  console.log();
}

main();

