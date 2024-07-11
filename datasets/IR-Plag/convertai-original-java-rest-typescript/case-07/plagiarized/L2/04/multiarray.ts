import * as readline from 'readline';

class multiarray {
  public static main(args: string[]): void {
    const rl = readline.createInterface({
      input: process.stdin,
      output: process.stdout
    });

    console.log('Enter a 4 by 4 matrix row by row:');
    const ma: number[][] = [];

    rl.on('line', (line: string) => {
      const row = line.split(' ').map(Number);
      ma.push(row);
      if (ma.length === 4) {
        rl.close();
        console.log(`Sum of the elements in the major diagonal is ${multiarray.sum(ma)}`);
      }
    });
  }

  public static sum(m: number[][]): number {
    let sum = 0;
    for (let i = 0; i < m.length; i++) {
      sum += m[i][i];
    }
    return sum;
  }
}

multiarray.main(process.argv.slice(2));

