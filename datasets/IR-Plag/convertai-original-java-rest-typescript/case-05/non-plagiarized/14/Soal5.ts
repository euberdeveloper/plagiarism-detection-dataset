import { Scanner } from 'readline-sync';

function reverse(number: number): void {
  const a: string = number.toString();
  
  for (let i: number = a.length - 1; i > -1; i--) {
    process.stdout.write(a.charAt(i));
  }
  console.log('');
}

const sc: Scanner = new Scanner();
console.log('Enter an integer: ');
const number: number = sc.nextInt();
reverse(number);

