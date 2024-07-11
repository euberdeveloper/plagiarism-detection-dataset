// Import any needed libraries
import { Console } from 'console';

function printMil(mil: number): void {
    for (let i = 1; i <= 10; i++) {
        Console.log(`${mil}\t\t${mil * 1.609}`);
        mil++;
    }
}

function main(): void {
    // Declare MIL
    let mil: number = 1;
    
    // Miles to kilometer
    Console.log('Miles\t\tKilometers');
    Console.log('-------------------------------');
    
    // Use while loop
    printMil(mil);
}

main();

