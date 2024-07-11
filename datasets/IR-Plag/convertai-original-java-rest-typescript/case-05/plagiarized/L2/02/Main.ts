package IR;

class Main {
    static main(args: string[]): void {
        // enter the number
        console.log("Enter an integer: ");
        const sc: readline.Interface = readline.createInterface({
            input: process.stdin,
            output: process.stdout
        });
        sc.question("", (input: string) => {
            const nmb: number = parseInt(input);
            // reverse number
            this.reverse(nmb);
            sc.close();
        });
    }

    static reverse(nmb: number): void {
        let reversedNumber: string = "";
        while (nmb !== 0) {
            const get: number = nmb % 10;
            // output
            reversedNumber += get.toString();
            nmb = Math.floor(nmb / 10);
        }
        console.log(reversedNumber);
    }
}

import * as readline from 'readline';

