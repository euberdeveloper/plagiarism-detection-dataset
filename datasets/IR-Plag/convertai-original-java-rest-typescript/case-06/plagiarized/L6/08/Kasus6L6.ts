import { Scanner } from 'readline-sync';

function Reverse(arr: number[]): void {
  for (let i = 0; i < 10; i++) {
    console.log(arr[i]);
  }
}

function main(): void {
  // Deklarasi
  const arrNum: number[] = new Array(10);
  const inp: Scanner = new Scanner();

  // for untuk 10 kali input
  for (let i = 9; i >= 0; i--) {
    // Read a number
    console.log('Read a number: ');
    arrNum[i] = inp.nextInt();
  }

  // Display the array
  Reverse(arrNum);
}

main();

