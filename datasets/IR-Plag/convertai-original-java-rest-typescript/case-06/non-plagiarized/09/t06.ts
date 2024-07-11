import { Scanner } from 'readline-sync';

const sc = new Scanner();

const arrNum: number[] = new Array(10);
for (let i = 0; i < 10; i++) {
  console.log('Read a number: ');
  arrNum[i] = sc.nextInt();
}

for (let i = 9; i > -1; i--) {
  console.log(arrNum[i]);
}

