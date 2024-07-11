import { Scanner } from 'readline-sync';

class Method {
  // method reverse
  public static beautyReverse(num: number): void {
    while (num !== 0) {
      const r = num % 10;
      console.log(r);
      num = Math.floor(num / 10);
    }
    console.log();
  }

  static reverse(n: number): void {
    Method.beautyReverse(n);
  }

  // main program
  public static main(args: string[]): void {
    console.log('Enter an integer: ');
    const input = new Scanner();
    const n = input.nextInt();
    // call method
    Method.reverse(n);
  }
}

