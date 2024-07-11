import * as readline from 'readline';

/**
 *
 * @author 020A6EC1A4D0C5BDB29FF826A462DA1C5D88CF08B60A4744AFFD95C61A0C3C7E
 */
function main(): void {
    const rl = readline.createInterface({
        input: process.stdin,
        output: process.stdout
    });

    rl.question('Enter an integer: ', (numberInput) => {
        const number = parseInt(numberInput);
        balik(number);
        rl.close();
    });
}

function balik(number: number): void {
    let output = '';
    while (number !== 0) {
        const remainder = number % 10;
        output += remainder;
        number = Math.floor(number / 10);
    }
    console.log(output);
}

main();

