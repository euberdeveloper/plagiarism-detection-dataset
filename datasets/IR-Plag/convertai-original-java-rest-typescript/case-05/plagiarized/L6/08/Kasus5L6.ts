import { Scanner } from 'readline-sync';

/**
 * 
 * @author B15130F5DDB6B5F1622EF91DAC4C1AAE
 */
function main(): void {
    //input data
    const inp: Scanner = new Scanner();
    console.log("Enter an integer: ");
    const angka: string = inp.next();
    for (let i: number = angka.length - 1; i >= 0; i--) {
        console.log(angka.charAt(i));
    }
    console.log();
}

main();

