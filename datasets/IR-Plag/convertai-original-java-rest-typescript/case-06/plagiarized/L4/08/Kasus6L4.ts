import { Scanner } from 'readline-sync';

function Reverse(arr: number[]): void {
  for (let i = 9; i >= 0; i--) {
    console.log(arr[i]);
  }
}

function main(): void {
  const arrNum: number[] = new Array(10);
  const inp: Scanner = new Scanner();

  for (let i = 0; i < 10; i++) {
    console.log('Read a number: ');
    arrNum[i] = inp.nextInt();
  }

  Reverse(arrNum);
}

main();

