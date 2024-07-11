import { Console } from 'console';

/**
 *
 * @author C2FE677A63FFD5B7FFD8FACBF327DAD0
 */
function main(): void {
    let miles: number = 1;
    Console.log('Miles    Kilometer');
    for (let i: number = 0; i < 10; i++) {
        const kilo: number = miles * 1.609;
        Console.log(`${miles}        ${kilo}`);
        miles++;
    }
}

main();

