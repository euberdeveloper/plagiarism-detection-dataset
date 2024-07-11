import { Scanner } from 'readline-sync';

/**
 *
 * @author CB6AB3315634A1E4D11B091BA48B60BA
 */
function main(args: string[]): void {
    const sc = new Scanner();
    console.log('Enter an integer : ');
    const number: number = sc.nextInt();
    reverse(number);
}

function reverse(number: number): void {
    const strNumber: string = number.toString();
    let temp: string = '';
    for (let i = strNumber.length; i > 0; i--) {
        temp += i;
    }
    const tempNumber: number = parseInt(temp);
    console.log(tempNumber);
}

main(process.argv.slice(2));

