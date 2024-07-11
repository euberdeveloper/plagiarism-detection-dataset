import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function inputArr(arr: number[]): number[] {
  for (let x = 0; x < 10; x++) {
    rl.question(`Read a number: `, (num) => {
      arr[x] = parseInt(num);
    });
  }
  return arr;
}

function printArr(arr: number[]): void {
  for (let x = 9; x >= 0; x--) {
    console.log(arr[x]);
  }
}

function main(): void {
  const arr: number[] = new Array(10);
  arr = inputArr(arr);
  printArr(arr);
  rl.close();
}

main();

