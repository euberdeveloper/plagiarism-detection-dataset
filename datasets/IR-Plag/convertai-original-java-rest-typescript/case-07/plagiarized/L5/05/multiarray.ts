import { Scanner } from 'readline-sync';

class multiarray {
  // Adds all the elements in the array
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
    // Input array
    const input = new Scanner();
    for (i = 0; i < 4; i++) {
      for (j = 0; j < 4; j++) {
        ma[i][j] = input.nextDouble();
      }
    }

    let sum = 0;
    i = 0;
    while (i < ma.length) {
      sum += ma[i][i];
      i++;
    }

    console.log(`Sum of the elements in the major diagonal is ${sum}`);
  }
}

