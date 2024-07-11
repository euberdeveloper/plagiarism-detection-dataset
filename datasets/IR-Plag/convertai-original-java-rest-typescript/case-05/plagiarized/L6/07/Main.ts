import { Scanner } from 'readline-sync';

function main(): void {
  let angka: number;
  console.log('Enter an integer: ');
  const input: Scanner = new Scanner();
  angka = input.nextInt();

  // Call the reverse function to reverse the generated value
  for (angka = angka; angka > 0; angka = Math.floor(angka / 10)) {
    const remainder: number = angka % 10;
    console.log(remainder);
  }
  console.log();
}

main();

