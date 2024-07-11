import * as readline from 'readline';

/**
 * 
 * @author CB6AB3315634A1E4D11B091BA48B60BA 7E51EEA5FA101ED4DADE9AD3A7A072BB 2F809B10D1ABEDBF2EC288F851B3EBBB
 */
async function main(): Promise<void> {
    const rl = readline.createInterface({
        input: process.stdin,
        output: process.stdout
    });

    const question = 'Enter an integer: ';
    const number = await new Promise<number>((resolve) => {
        rl.question(question, (input) => {
            resolve(parseInt(input));
        });
    });

    reverse(number);
    rl.close();
}

function reverse(number: number): void {
    let reversedNumber = '';
    while (number > 0) {
        reversedNumber += (number % 10);
        number = Math.floor(number / 10);
    }
    console.log(reversedNumber);
}

main();

