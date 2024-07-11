import { Scanner } from 'readline-sync';

function reverse(number: number): void {
  const angka: string = number.toString();
  for (let i: number = angka.length - 1; i >= 0; i--) {
    console.log(angka.charAt(i));
  }
}

const sc: Scanner = new Scanner();
console.log('Enter an integer: ');
const number: number = sc.nextInt();
reverse(number);

