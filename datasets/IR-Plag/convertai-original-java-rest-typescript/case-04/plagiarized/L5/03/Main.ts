import { Console } from 'console';

let mile: number;

function loops(): void {
  //Use while loop
  for (let i = 1; i <= 10; i++) {
    Console.log(`${mile}\t\t${mile * 1.609}`);
    mile++;
  }
}

mile = 1;
Console.log('Miles\t\tKilometers');
Console.log('-------------------------------');
loops();

