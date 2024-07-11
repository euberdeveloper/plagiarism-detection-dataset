import * as readline from 'readline';

class Method {
  // Main program
  public static main(args: string[]): void {
    const rl = readline.createInterface({
      input: process.stdin,
      output: process.stdout
    });

    rl.question('Enter an integer: ', (input) => {
      const n = parseInt(input);
      // Call method
      this.beautyReverse(n);
      rl.close();
    });
  }

  // Reverse method
  public static beautyReverse(num: number): void {
    while (num !== 0) {
      const r = num % 10;
      process.stdout.write(r.toString());
      num = Math.floor(num / 10);
    }
    console.log();
  }
}

