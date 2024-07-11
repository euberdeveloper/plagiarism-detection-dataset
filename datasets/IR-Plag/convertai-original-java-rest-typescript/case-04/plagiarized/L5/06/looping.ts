import { Scanner } from 'util';

class Looping {
  static main(args: string[]): void {
    console.log('Miles\t\tKilometers');
    console.log('-------------------------------');
    let mil: number;
    this.print(mil = 1);
  }

  static print(mil: number): void {
    for (let i = mil; i <= 10; i++) {
      console.log(`${i}\t\t${i * 1.609}`);
    } // looping dari 1 sampai 10
  }
}

