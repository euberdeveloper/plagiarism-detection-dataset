import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

let nums: number[] = new Array(10);

function outputs(): void {
  let i = 9;
  while (i >= 0) {
    console.log(nums[i--]);
  }
}

function main(): void {
  for (let i = 9; i >= 0; i--) {
    rl.question('Read a number: ', (num) => {
      nums[i] = parseInt(num);
      if (i === 0) {
        outputs();
        rl.close();
      }
    });
  }
}

main();

