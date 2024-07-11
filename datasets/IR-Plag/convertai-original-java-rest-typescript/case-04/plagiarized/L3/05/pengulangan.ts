import { Console } from 'console';

class inputoutput {
  public static main(args: string[]): void {
    let m: number = 1;
    // print seusatu
    console.log('Miles\t\tKilometers');
    console.log('-------------------------------');
    // pake pengulangan while
    while (m <= 10) {
      console.log(`${m}\t\t${m * 1.609}`);
      m++;
      // ditambahin iteratornya
    }
  }
}

