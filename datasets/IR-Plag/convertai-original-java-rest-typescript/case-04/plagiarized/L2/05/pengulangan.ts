import { println, printf } from 'util';

class InputOutput {
  public static main(args: string[]): void {
    println('Miles\t\tKilometers');
    println('-------------------------------');

    let m = 1;
    while (m <= 10) {
      printf('%d\t\t%.3f\n', m, m * 1.609);
      m++;
    }
  }
}

