import { Console } from 'console';

class InputOutput {
  public static main(args: string[]): void {
    // print something
    console.log('Miles\t\tKilometers');
    console.log('-------------------------------');
    // use while loop
    let miles: number = 1;
    while (miles <= 10) {
      console.log(`${miles}\t\t${miles * 1.609}`);
      miles++;
      // increment the iterator
    }
  }
}

