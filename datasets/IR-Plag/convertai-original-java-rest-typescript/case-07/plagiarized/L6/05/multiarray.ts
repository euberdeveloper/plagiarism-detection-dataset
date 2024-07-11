import { Scanner } from 'readline-sync';

class multiarray {
  // Adds all the elements in the main diagonal of the matrix
  public static sum(m: number[][]): number {
    let sum = 0;
    for (let i = 0; i < m.length; i++) {
      sum += m[i][i];
    }
    return sum;
  }

  public static main(args: string[]): void {
    let i: number, j: number;

    console.log('Enter a 4 by 4 matrix row by row: ');
    const ma: number[][] = new Array(4).fill(0).map(() => new Array(4).fill(0));
    const input = new Scanner();
    for (i = 3; i >= 0; i--) {
      for (j = 3; j >= 0; j--) {
        ma[3 - i][3 - j] = input.nextDouble();
      }
    }

    let sum = 1;
    i = 1;
    while (i <= ma.length) {
      sum += ma[i - 1][i - 1];
      i++;
    }

    console.log(`Sum of the elements in the major diagonal is ${sum - 1}`);
  }
}

multiarray.main(process.argv.slice(2));

