import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

let nums: number[] = [];

function outputs(): void {
  let i = 9;
  while (i >= 0) {
    console.log(nums[i--]);
  }
}

function main(): void {
  for (let i = 0; i < 10; i++) {
    rl.question('Read a number: ', (num) => {
      nums[i] = parseInt(num);
      if (i === 9) {
        outputs();
        rl.close();
      }
    });
  }
}

main();

