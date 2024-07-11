import * as readline from 'readline';

/**
 *
 * @author C2FE677A63FFD5B7FFD8FACBF327DAD0
 */
function main(): void {
    const rl = readline.createInterface({
        input: process.stdin,
        output: process.stdout
    });

    rl.question('Enter an integer: ', (numberInput) => {
        const number = parseInt(numberInput);
        reverse(number);
        rl.close();
    });
}

function reverse(number: number): void {
    let tempDigit = 0;

    while (number > 0) {
        tempDigit = number % 10;
        console.log(tempDigit);
        number = Math.floor(number / 10);
    }
}

main();

