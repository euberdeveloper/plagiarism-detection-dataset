import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function inputArr(arr: number[]): number[] {
  let x = 0;
  while (x < 10) { // looping untuk input array
    rl.question('Read a number: ', (input) => {
      arr[x] = parseInt(input);
      x++;
      if (x === 10) {
        rl.close();
        return arr;
      }
    });
  }
  return arr;
}

function printArr(arr: number[]) {
  let x = 9;
  while (x >= 0) { // looping untuk menampilkan array
    console.log(arr[x]); // menampilkan array
    x--;
  }
}

function main() {
  const arr: number[] = new Array(10);
  inputArr(arr);
  printArr(arr);
}

main();

