package IR;

/**
 *
 * @author 020A6EC1A4D0C5BDB29FF826A462DA1C5D88CF08B60A4744AFFD95C61A0C3C7E
 */
class Main {
    public static main(args: string[]): void {
        console.log("Enter an integer: ");
        const input: NodeJS.ReadLine = require('readline').createInterface({
            input: process.stdin,
            output: process.stdout
        });

        input.question('', (number: string) => {
            this.reverse(parseInt(number));
            input.close();
        });
    }

    public static reverse(number: number): void {
        let reversedNumber: string = '';
        while (number !== 0) {
            const remainder: number = number % 10;
            reversedNumber += remainder.toString();
            number = Math.floor(number / 10);
        }
        console.log(reversedNumber);
    }
}

