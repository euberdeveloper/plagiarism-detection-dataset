import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function inputArr(arr: number[]): number[] {
  const arr2: number[] = new Array(10);
  for (let x = 0; x < 10; x++) {
    rl.question('Read a number: ', (input) => {
      arr[x] = parseInt(input);
      if (x === 9) {
        for (let i = 0; i < 10; i++) {
          arr2[i] = arr[9 - i];
        }
        rl.close();
        return arr2;
      }
    });
  }
  return arr2;
}

function printArr(arr: number[]): void {
  for (let x = 0; x < 10; x++) {
    console.log(arr[x]);
  }
}

function main(): void {
  const arr: number[] = new Array(10);
  printArr(inputArr(arr));
}

main();

