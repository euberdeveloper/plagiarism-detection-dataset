import { Scanner } from 'readline-sync';

function reverse(number: number): void {
  const tmpNumber: string = number.toString();
  let result: string = '';
  for (let i: number = tmpNumber.length - 1; i >= 0; i--) {
    result += tmpNumber.charAt(i);
  }
  console.log(result);
}

function main(): void {
  const sc: Scanner = new Scanner();
  console.log('Enter an integer: ');
  const num: number = sc.nextInt();
  reverse(num);
}

main();

