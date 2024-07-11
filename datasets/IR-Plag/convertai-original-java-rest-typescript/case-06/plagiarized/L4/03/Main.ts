import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

let nums: number[] = [];

function outputs(): void {
  // Display the array
  for (let i = 9; i >= 0; i--) {
    console.log(nums[i]);
  }
}

function main(): void {
  for (let i = 0; i < 10; i++) {
    // Read a number
    rl.question('Read a number: ', (input) => {
      nums[i] = parseInt(input);
      if (i === 9) {
        outputs();
        rl.close();
      }
    });
  }
}

main();

