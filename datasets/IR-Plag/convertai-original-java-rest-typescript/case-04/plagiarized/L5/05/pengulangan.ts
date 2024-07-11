import { forEach } from 'lodash';

class inputoutput {
  static hitHasil(m: number): void {
    for (let a = m; a <= 10; a++) {
      console.log(`${a}\t\t${a * 1.609}`);
    }
  }

  public static main(args: string[]): void {
    const m = 1;
    console.log('Miles\t\tKilometers');
    console.log('-------------------------------');
    this.hitHasil(m);
  }
}

inputoutput.main(process.argv.slice(2));

