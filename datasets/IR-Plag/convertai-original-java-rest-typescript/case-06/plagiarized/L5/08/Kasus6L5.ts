import { Scanner } from 'readline-sync';

function main(): void {
  // Delarasi
  const arrNum: number[] = new Array(10);
  const inp: Scanner = new Scanner();
  // for untuk 10 kali input
  let i: number = 0;
  while (i < 10) {
    // Read a number
    console.log('Read a number: ');
    arrNum[i] = inp.nextInt();
    i++;
  }
  // Display the array
  Reverse(arrNum);
}

function Reverse(arr: number[]): void {
  let i: number = 9;
  while (i >= 0) {
    // Print angka dalam array
    console.log(arr[i]);
    i--;
  }
}

main();

