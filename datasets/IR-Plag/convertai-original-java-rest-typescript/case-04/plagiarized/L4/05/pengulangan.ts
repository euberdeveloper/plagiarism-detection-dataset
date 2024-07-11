import { forEach } from 'lodash';

class inputoutput {
  static hitHasil(m: number): void {
    while (m <= 10) {
      console.log(`${m}\t\t${m * 1.609}`);
      m++;
    }
  }

  public static main(args: string[]): void {
    let m = 1;
    console.log('Miles\t\tKilometers');
    console.log('-------------------------------');
    this.hitHasil(m);
  }
}

inputoutput.main(process.argv.slice(2));

