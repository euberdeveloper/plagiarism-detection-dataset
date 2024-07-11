import * as readline from 'readline';

class Method {
  // Main program
  public static main(args: string[]): void {
    const rl = readline.createInterface({
      input: process.stdin,
      output: process.stdout
    });

    rl.question('Enter an integer: ', (numberStr) => {
      const number = parseInt(numberStr);
      // Call the reverse method
      this.reverse(number);
      rl.close();
    });
  }

  // Reverse method
  public static reverse(number: number): void {
    let reversedNumber = '';
    while (number !== 0) {
      const remainder = number % 10;
      reversedNumber += remainder;
      number = Math.floor(number / 10);
    }
    console.log(reversedNumber);
  }
}

Method.main(process.argv.slice(2));

